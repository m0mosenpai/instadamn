package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.DxS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31771DxS extends BaseAdapter implements Filterable {
    public final int A03;
    public final Context A04;
    public final InterfaceC11380iw A05;
    public final C31774DxX A06;
    public final InterfaceC02900Bo A07;
    public final boolean A0A;
    public final List A09 = AbstractC166987dD.A1E();
    public final Comparator A08 = Comparator.comparing(new GRN(0));
    public boolean A02 = false;
    public List A01 = AbstractC166987dD.A1E();
    public CharSequence A00 = "";

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return !this.A0A;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.A01.size();
        if (this.A0A) {
            return size + 1;
        }
        return size;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List list;
        if (this.A0A) {
            if (i == 0) {
                return null;
            }
            list = this.A01;
            i--;
        } else {
            list = this.A01;
        }
        return list.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (i == 0 && this.A0A) {
            return 1;
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        if (!this.A0A) {
            return 1;
        }
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        if (this.A0A && i <= 0) {
            return false;
        }
        return true;
    }

    public C31771DxS(Context context, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, FH0 fh0, int i, boolean z) {
        this.A04 = context;
        this.A05 = interfaceC11380iw;
        this.A07 = C0BQ.A00(abstractC12990ll);
        this.A0A = z;
        this.A03 = i;
        this.A06 = new C31774DxX(fh0, this);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.A06;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (getItem(i) == null) {
            return Long.MIN_VALUE;
        }
        return ((InterfaceC37225Gaa) r0).getUsername().hashCode();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Drawable drawable;
        if (getItemViewType(i) == 1) {
            if (view == null) {
                View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.autocomplete_user_dropdown_header);
                AbstractC13880nE.A0Z(A0A.requireViewById(R.id.dropdown_header), this.A03);
                return A0A;
            }
            return view;
        }
        if (view == null) {
            view = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.autocomplete_user_row);
            AbstractC13880nE.A0Z(view, this.A03);
            view.setTag(new C34563FKx(view));
        }
        Object item = getItem(i);
        item.getClass();
        InterfaceC37225Gaa interfaceC37225Gaa = (InterfaceC37225Gaa) item;
        C34563FKx c34563FKx = (C34563FKx) AbstractC31172DnG.A0x(view);
        ImageUrl BGs = interfaceC37225Gaa.BGs();
        if (BGs != null) {
            c34563FKx.A02.setUrl(BGs, this.A05);
        }
        c34563FKx.A01.setText(interfaceC37225Gaa.getUsername());
        String A00 = C31774DxX.A00(interfaceC37225Gaa, C31774DxX.A01(this.A00));
        if (A00 != null && !A00.equals(interfaceC37225Gaa.getUsername())) {
            TextView textView = c34563FKx.A00;
            textView.setVisibility(0);
            textView.setText(AnonymousClass001.A0R(A00, " "));
            int AdK = interfaceC37225Gaa.AdK();
            if (AdK != 0) {
                drawable = this.A04.getDrawable(AdK);
            } else {
                drawable = null;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            AbstractC85953sP.A04(textView);
            return view;
        }
        c34563FKx.A00.setVisibility(8);
        return view;
    }
}
