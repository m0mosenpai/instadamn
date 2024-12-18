package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import java.util.Arrays;

/* renamed from: X.2zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66692zm extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "PartialEmptyState";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C34637FNu c34637FNu = (C34637FNu) obj;
        return Arrays.hashCode(new Object[]{c34637FNu.A01, Boolean.valueOf(c34637FNu.A06), c34637FNu.A04, c34637FNu.A03, Boolean.valueOf(c34637FNu.A05)});
    }

    public C66692zm(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int intValue;
        int A03 = C0f9.A03(1403186767);
        C34637FNu c34637FNu = (C34637FNu) obj;
        Object tag = view.getTag();
        tag.getClass();
        C34530FJq c34530FJq = (C34530FJq) tag;
        Integer num = c34637FNu.A01;
        if (num != null && (intValue = num.intValue()) != -1) {
            c34530FJq.A01.EW2(intValue, true);
        }
        IgdsEmptyState igdsEmptyState = c34530FJq.A01;
        igdsEmptyState.setHeadline(c34637FNu.A04);
        igdsEmptyState.setBody(c34637FNu.A03);
        igdsEmptyState.setAction(c34637FNu.A02, c34637FNu.A00);
        int i2 = 0;
        igdsEmptyState.setVisibility(0);
        View view2 = c34530FJq.A00;
        if (c34637FNu.A05) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        C0f9.A0A(-1349574229, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-433745923);
        View inflate = LayoutInflater.from(this.A00).inflate(R.layout.layout_listview_partial_empty_state, viewGroup, false);
        inflate.setTag(new C34530FJq(inflate));
        C0f9.A0A(-1358193065, A03);
        return inflate;
    }
}
