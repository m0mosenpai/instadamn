package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.ElY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33239ElY extends EPV {
    public final Context A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33239ElY(Context context, AbstractC12990ll abstractC12990ll, InterfaceC11380iw interfaceC11380iw) {
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
        View inflate;
        int i2;
        C14360o3.A0B(viewGroup, 0);
        if (i != -2) {
            if (i != -1) {
                return super.onCreateViewHolder(viewGroup, i);
            }
            inflate = LayoutInflater.from(this.A00).inflate(R.layout.visibility_off_instagram_loading_fragment, viewGroup, false);
            i2 = 2;
        } else {
            inflate = LayoutInflater.from(this.A00).inflate(R.layout.bloks_error_layout, viewGroup, false);
            i2 = 3;
        }
        return new E41(inflate, i2);
    }

    @Override // X.EPV, X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int itemViewType;
        int i2;
        int A03 = C0f9.A03(-1155867574);
        Object item = getItem(i);
        if (item instanceof FBQ) {
            itemViewType = -1;
            i2 = 1159628268;
        } else if (item instanceof FBP) {
            itemViewType = -2;
            i2 = 2112705190;
        } else {
            itemViewType = super.getItemViewType(i);
            i2 = 1388075678;
        }
        C0f9.A0A(i2, A03);
        return itemViewType;
    }

    @Override // X.EPV, android.widget.Adapter
    public final int getViewTypeCount() {
        return super.getViewTypeCount() + 2;
    }
}
