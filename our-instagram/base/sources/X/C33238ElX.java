package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.ElX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33238ElX extends EPV {
    public final Context A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33238ElX(Context context, AbstractC12990ll abstractC12990ll, InterfaceC11380iw interfaceC11380iw) {
        super(context, abstractC12990ll, interfaceC11380iw);
        C14360o3.A0B(abstractC12990ll, 2);
        this.A00 = context;
    }

    @Override // X.EPV, X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        int itemViewType = getItemViewType(i);
        if (itemViewType != -2 && itemViewType != -1) {
            super.onBindViewHolder(c3oo, i);
        }
    }

    @Override // X.EPV, X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != -2) {
            if (i != -1) {
                return super.onCreateViewHolder(viewGroup, i);
            }
            return new E41(LayoutInflater.from(this.A00).inflate(R.layout.birthday_visibility_settings_loading_fragment, viewGroup, false), 0);
        }
        return new E41(LayoutInflater.from(this.A00).inflate(R.layout.bloks_error_layout, viewGroup, false), 1);
    }

    @Override // X.EPV, X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int itemViewType;
        int A03 = C0f9.A03(880729561);
        Object item = getItem(i);
        if (item instanceof FBL) {
            itemViewType = -1;
        } else if (item instanceof FBK) {
            itemViewType = -2;
        } else {
            itemViewType = super.getItemViewType(i);
        }
        C0f9.A0A(-1010721149, A03);
        return itemViewType;
    }

    @Override // X.EPV, android.widget.Adapter
    public final int getViewTypeCount() {
        return super.getViewTypeCount() + 2;
    }
}
