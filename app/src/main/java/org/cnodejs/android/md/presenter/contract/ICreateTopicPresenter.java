package org.cnodejs.android.md.presenter.contract;

import android.support.annotation.NonNull;

import org.cnodejs.android.md.model.entity.TabType;

public interface ICreateTopicPresenter {

    void createTipicAsyncTask(@NonNull TabType tab, String title, String content);

}
