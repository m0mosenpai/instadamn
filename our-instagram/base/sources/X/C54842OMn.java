package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.OMn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54842OMn {
    public SpannableStringBuilder A00;
    public InterfaceC58307Psz A01;
    public CharSequence A02;
    public boolean A03;
    public final AbstractC12990ll A04;
    public final LinkedList A05;
    public final List A06;
    public final List A07;

    public C54842OMn(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A04 = abstractC12990ll;
        this.A07 = AbstractC166987dD.A1E();
        this.A06 = AbstractC166987dD.A1E();
        this.A05 = new LinkedList();
    }

    public final void A00(Context context, View.OnClickListener onClickListener, String str, int i) {
        A03(context, onClickListener, str, null, i, true);
    }

    public final void A01(Context context, View.OnClickListener onClickListener, String str, int i) {
        A03(context, onClickListener, str, null, i, false);
    }

    public final void A02(Context context, View.OnClickListener onClickListener, String str, String str2, float f, int i, int i2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 1);
        int i3 = R.attr.igds_color_primary_text;
        if (z) {
            i3 = R.attr.igds_color_error_or_destructive;
        }
        C50676MYu c50676MYu = new C50676MYu(onClickListener, str, f, AbstractC53242c7.A0H(context, i3), i, i2);
        c50676MYu.A03 = str2;
        c50676MYu.A05 = z3;
        c50676MYu.A06 = z2;
        this.A05.add(c50676MYu);
    }

    public final void A03(Context context, View.OnClickListener onClickListener, String str, String str2, int i, boolean z) {
        AbstractC167007dF.A1F(str, 1, onClickListener);
        A02(context, onClickListener, str, str2, 1.0f, i, 0, z, false, true);
    }

    public final void A04(Context context, C3PD c3pd, String str, String str2, float f, int i, boolean z) {
        List list;
        AbstractC167017dG.A1P(str, str2);
        OFM ofm = new OFM(null, context.getDrawable(i), null, c3pd, str2, str, f, z, true, false);
        if (z) {
            list = this.A06;
        } else {
            list = this.A07;
        }
        list.add(ofm);
    }

    public final void A06(boolean z) {
        LinkedList linkedList = this.A05;
        if (z) {
            linkedList.addFirst(new C35119FeM(true));
        } else {
            C35119FeM.A00(linkedList, true);
        }
    }

    public final void A05(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str, String str2, int i, int i2, int i3, int i4, int i5) {
        C54737OFo c54737OFo = new C54737OFo(onClickListener, null, onClickListener2, null, EnumC53237Nga.A05, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), null, null, str, null, str2, true, true);
        LinkedList linkedList = this.A05;
        linkedList.addFirst(new C35119FeM(true));
        linkedList.addFirst(c54737OFo);
    }
}
