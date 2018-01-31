package com.roae.taeitf.taeitf.common.basecontract;

public interface BasePresenter<T extends BaseView> {
  void setView(T view);
}
