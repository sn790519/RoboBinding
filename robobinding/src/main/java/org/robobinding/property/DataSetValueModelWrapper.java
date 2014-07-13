package org.robobinding.property;

import org.robobinding.itempresentationmodel.ItemPresentationModel;

/**
 * 
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
public class DataSetValueModelWrapper<T> implements DataSetValueModel<T> {
    private DataSetValueModel<T> valueModel;

    public DataSetValueModelWrapper(DataSetValueModel<T> valueModel) {
	this.valueModel = valueModel;
    }

    @Override
    public int size() {
	return valueModel.size();
    }

    @Override
    public T getItem(int position) {
	return valueModel.getItem(position);
    }

    @Override
    public ItemPresentationModel<T> newItemPresentationModel() {
	return valueModel.newItemPresentationModel();
    }

    @Override
    public void addPropertyChangeListener(PresentationModelPropertyChangeListener listener) {
	valueModel.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PresentationModelPropertyChangeListener listener) {
	valueModel.removePropertyChangeListener(listener);
    }

}