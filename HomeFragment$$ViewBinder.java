// Generated code from Butter Knife. Do not modify!
package com.idol.idolnews.homeMvp;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class HomeFragment$$ViewBinder<T extends HomeFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends HomeFragment> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.recyclerView = finder.findRequiredViewAsType(source, 2131230853, "field 'recyclerView'", RecyclerView.class);
      target.swipeLayout = finder.findRequiredViewAsType(source, 2131230897, "field 'swipeLayout'", SwipeRefreshLayout.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.recyclerView = null;
      target.swipeLayout = null;

      this.target = null;
    }
  }
}
