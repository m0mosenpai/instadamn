package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class UA0 extends ActionMode {
    public final Context A00;
    public final VK7 A01;

    @Override // android.view.ActionMode
    public final void finish() {
        this.A01.A00();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        WeakReference weakReference;
        VK7 vk7 = this.A01;
        if (vk7 instanceof UDD) {
            weakReference = ((UDD) vk7).A04;
        } else {
            weakReference = ((UDE) vk7).A01;
        }
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        WQH wqh;
        Context context = this.A00;
        VK7 vk7 = this.A01;
        if (vk7 instanceof UDD) {
            wqh = ((UDD) vk7).A02;
        } else {
            wqh = ((UDE) vk7).A03;
        }
        return new UDG(context, wqh);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        Context context;
        VK7 vk7 = this.A01;
        if (vk7 instanceof UDD) {
            context = ((UDD) vk7).A03.getContext();
        } else {
            context = ((UDE) vk7).A02;
        }
        return new UA6(context);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        ActionBarContextView actionBarContextView;
        VK7 vk7 = this.A01;
        if (vk7 instanceof UDD) {
            actionBarContextView = ((UDD) vk7).A03;
        } else {
            actionBarContextView = ((UDE) vk7).A04.A09;
        }
        return actionBarContextView.A04;
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.A01.A00;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        ActionBarContextView actionBarContextView;
        VK7 vk7 = this.A01;
        if (vk7 instanceof UDD) {
            actionBarContextView = ((UDD) vk7).A03;
        } else {
            actionBarContextView = ((UDE) vk7).A04.A09;
        }
        return actionBarContextView.A05;
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.A01.A01;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.A01.A01();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        ActionBarContextView actionBarContextView;
        VK7 vk7 = this.A01;
        if (vk7 instanceof UDD) {
            actionBarContextView = ((UDD) vk7).A03;
        } else {
            actionBarContextView = ((UDE) vk7).A04.A09;
        }
        return actionBarContextView.A07;
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        WeakReference weakReference;
        VK7 vk7 = this.A01;
        if (vk7 instanceof UDD) {
            UDD udd = (UDD) vk7;
            udd.A03.setCustomView(view);
            if (view != null) {
                weakReference = new WeakReference(view);
            } else {
                weakReference = null;
            }
            udd.A04 = weakReference;
            return;
        }
        UDE ude = (UDE) vk7;
        ude.A04.A09.setCustomView(view);
        ude.A01 = new WeakReference(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        String string;
        Object obj;
        ActionBarContextView actionBarContextView;
        VK7 vk7 = this.A01;
        if (vk7 instanceof UDD) {
            UDD udd = (UDD) vk7;
            string = udd.A00.getString(i);
            obj = udd;
        } else {
            UDE ude = (UDE) vk7;
            string = ude.A04.A01.getResources().getString(i);
            obj = ude;
        }
        if (obj instanceof UDD) {
            actionBarContextView = ((UDD) obj).A03;
        } else {
            actionBarContextView = ((UDE) obj).A04.A09;
        }
        actionBarContextView.setSubtitle(string);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.A01.A00 = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        String string;
        Object obj;
        ActionBarContextView actionBarContextView;
        VK7 vk7 = this.A01;
        if (vk7 instanceof UDD) {
            UDD udd = (UDD) vk7;
            string = udd.A00.getString(i);
            obj = udd;
        } else {
            UDE ude = (UDE) vk7;
            string = ude.A04.A01.getResources().getString(i);
            obj = ude;
        }
        if (obj instanceof UDD) {
            actionBarContextView = ((UDD) obj).A03;
        } else {
            actionBarContextView = ((UDE) obj).A04.A09;
        }
        actionBarContextView.setTitle(string);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        ActionBarContextView actionBarContextView;
        VK7 vk7 = this.A01;
        if (vk7 instanceof UDD) {
            UDD udd = (UDD) vk7;
            ((VK7) udd).A01 = z;
            actionBarContextView = udd.A03;
        } else {
            UDE ude = (UDE) vk7;
            ((VK7) ude).A01 = z;
            actionBarContextView = ude.A04.A09;
        }
        actionBarContextView.setTitleOptional(z);
    }

    public UA0(Context context, VK7 vk7) {
        this.A00 = context;
        this.A01 = vk7;
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        ActionBarContextView actionBarContextView;
        VK7 vk7 = this.A01;
        if (vk7 instanceof UDD) {
            actionBarContextView = ((UDD) vk7).A03;
        } else {
            actionBarContextView = ((UDE) vk7).A04.A09;
        }
        actionBarContextView.setSubtitle(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        ActionBarContextView actionBarContextView;
        VK7 vk7 = this.A01;
        if (vk7 instanceof UDD) {
            actionBarContextView = ((UDD) vk7).A03;
        } else {
            actionBarContextView = ((UDE) vk7).A04.A09;
        }
        actionBarContextView.setTitle(charSequence);
    }
}
