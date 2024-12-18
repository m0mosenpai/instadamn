package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.model.LeadGenTrustSignal;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import java.util.List;

/* loaded from: classes9.dex */
public final class PVW implements InterfaceC19960yQ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public PVW(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A01 = obj4;
        this.A03 = obj5;
        this.A02 = obj6;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload;
        IgTextView igTextView;
        Context context;
        Drawable A07;
        Context context2;
        String string;
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload2;
        LeadGenTrustSignal leadGenTrustSignal;
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload3;
        LeadGenTrustSignal leadGenTrustSignal2;
        String str5;
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload4;
        LeadGenTrustSignal leadGenTrustSignal3;
        ImageUrl imageUrl;
        if (this.A00 != 0) {
            LeadGenProfileContentInfo leadGenProfileContentInfo = (LeadGenProfileContentInfo) obj;
            TextView textView = (TextView) this.A04;
            if (leadGenProfileContentInfo != null) {
                str = leadGenProfileContentInfo.A02;
            } else {
                str = null;
            }
            textView.setText(str);
            if (leadGenProfileContentInfo != null && (imageUrl = leadGenProfileContentInfo.A00) != null) {
                ((IgImageView) this.A01).setUrl(imageUrl, (AbstractC59962oe) this.A06);
            }
            C52120N4t c52120N4t = (C52120N4t) this.A06;
            IgTextView igTextView2 = (IgTextView) this.A02;
            if (leadGenProfileContentInfo != null && (leadGenTrustSignalsPayload4 = leadGenProfileContentInfo.A01) != null && (leadGenTrustSignal3 = leadGenTrustSignalsPayload4.A00) != null) {
                str2 = leadGenTrustSignal3.A02;
            } else {
                str2 = null;
            }
            C52120N4t.A00(igTextView2, str2);
            if (leadGenProfileContentInfo != null && (leadGenTrustSignalsPayload3 = leadGenProfileContentInfo.A01) != null && (leadGenTrustSignal2 = leadGenTrustSignalsPayload3.A02) != null && (str5 = leadGenTrustSignal2.A02) != null) {
                num = AbstractC003100w.A0i(str5);
            } else {
                num = null;
            }
            IgTextView igTextView3 = (IgTextView) this.A03;
            if (num != null) {
                str3 = AbstractC31174DnI.A0w(c52120N4t, C84963qk.A03(AbstractC31177DnL.A09(c52120N4t), Integer.valueOf(num.intValue())), 2131964993);
            } else {
                str3 = null;
            }
            C52120N4t.A00(igTextView3, str3);
            IgTextView igTextView4 = c52120N4t.A00;
            if (leadGenProfileContentInfo != null && (leadGenTrustSignalsPayload2 = leadGenProfileContentInfo.A01) != null && (leadGenTrustSignal = leadGenTrustSignalsPayload2.A01) != null) {
                str4 = leadGenTrustSignal.A02;
            } else {
                str4 = null;
            }
            C52120N4t.A00(igTextView4, str4);
            if (leadGenProfileContentInfo != null && (leadGenTrustSignalsPayload = leadGenProfileContentInfo.A01) != null) {
                View view = (View) this.A05;
                List<LeadGenTrustSignal> list = leadGenTrustSignalsPayload.A05;
                ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.profile_content_trust_signals_list);
                A0C.removeAllViews();
                for (LeadGenTrustSignal leadGenTrustSignal4 : list) {
                    String str6 = leadGenTrustSignal4.A02;
                    if (str6 != null && str6.length() != 0) {
                        C50817Mcr c50817Mcr = new C50817Mcr(AbstractC166997dE.A0L(view));
                        EnumC53274NhC enumC53274NhC = leadGenTrustSignal4.A01;
                        Integer num2 = enumC53274NhC.A01;
                        if (num2 != null && (string = (context2 = c50817Mcr.getContext()).getString(num2.intValue())) != null) {
                            String A0q = AbstractC166997dE.A0q(context2.getResources(), 2131961132);
                            igTextView = c50817Mcr.A00;
                            str6 = AbstractC25226BEj.A1H(A0q, AbstractC43592JPx.A13(string, str6), null);
                        } else {
                            igTextView = c50817Mcr.A00;
                        }
                        igTextView.setText(str6);
                        Integer num3 = enumC53274NhC.A00;
                        Drawable drawable = null;
                        if (num3 != null && (A07 = MSX.A07((context = c50817Mcr.getContext()), num3)) != null) {
                            AbstractC25231BEo.A0x(context, A07, AbstractC53242c7.A08(context));
                            drawable = A07;
                        }
                        c50817Mcr.A01.setImageDrawable(drawable);
                        ViewOnClickListenerC55465OkK.A01(c50817Mcr, 51, leadGenTrustSignal4, c52120N4t);
                        A0C.addView(c50817Mcr);
                    }
                }
            }
        } else {
            C50627MWo c50627MWo = (C50627MWo) obj;
            int ordinal = ((C6R) c50627MWo.A00).ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal == 1) {
                        BP5.A00((BP5) ((C26858BtK) this.A06).A00.getValue(), null, "learn_more_bottom_sheet_impression");
                        View view2 = (View) this.A05;
                        C14360o3.A0A(view2);
                        view2.setVisibility(8);
                        View view3 = (View) this.A04;
                        C14360o3.A0A(view3);
                        view3.setVisibility(0);
                        QJ0 qj0 = (QJ0) c50627MWo.A01;
                        if (qj0 != null) {
                            IgdsBulletCell igdsBulletCell = (IgdsBulletCell) this.A01;
                            IgdsBulletCell igdsBulletCell2 = (IgdsBulletCell) this.A03;
                            IgdsBulletCell igdsBulletCell3 = (IgdsBulletCell) this.A02;
                            igdsBulletCell.setText((CharSequence) null, qj0.A01);
                            igdsBulletCell2.setText((CharSequence) null, qj0.A04);
                            igdsBulletCell2.setIcon(R.drawable.instagram_warning_pano_outline_24);
                            igdsBulletCell3.setText((CharSequence) null, AnonymousClass773.A00((android.net.Uri) qj0.A00, qj0.A03, qj0.A02));
                            igdsBulletCell3.setIcon(R.drawable.instagram_lock_pano_outline_24);
                            igdsBulletCell3.setMovementMethod(null, LinkMovementMethod.getInstance());
                        }
                    } else {
                        throw B4Z.A00();
                    }
                }
            } else {
                View view4 = (View) this.A05;
                C14360o3.A0A(view4);
                view4.setVisibility(0);
                View view5 = (View) this.A04;
                C14360o3.A0A(view5);
                view5.setVisibility(8);
            }
        }
        return C0eB.A00;
    }
}
