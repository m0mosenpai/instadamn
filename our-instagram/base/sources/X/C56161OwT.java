package X;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.user.model.User;

/* renamed from: X.OwT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56161OwT implements C3PE {
    public C50947MfG A00;
    public AnonymousClass195 A01;
    public AnonymousClass195 A02;
    public final ValueAnimator A03;
    public final View A04;
    public final UserSession A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;

    public C56161OwT(View view, UserSession userSession) {
        int A06 = AbstractC167007dF.A06(1, userSession, view);
        this.A05 = userSession;
        this.A04 = view;
        this.A06 = C57556PgU.A01(this, 34);
        this.A0E = C57556PgU.A01(this, 42);
        this.A0D = C57556PgU.A01(this, 41);
        float[] fArr = new float[A06];
        // fill-array-data instruction
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setDuration(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        this.A03 = ofFloat;
        this.A08 = C57556PgU.A01(this, 36);
        this.A07 = C57556PgU.A01(this, 35);
        this.A09 = C57556PgU.A01(this, 37);
        this.A0C = C57556PgU.A01(this, 40);
        this.A0A = C57556PgU.A01(this, 38);
        this.A0B = C57556PgU.A01(this, 39);
        this.A0G = C57556PgU.A01(this, 44);
        this.A0F = C57556PgU.A01(this, 43);
        InterfaceC09390do interfaceC09390do = this.A06;
        AbstractC166987dD.A0c(AbstractC166987dD.A0d(interfaceC09390do), R.id.iglive_header_chevron).setVisibility(8);
        MSY.A0z(AbstractC166987dD.A0d(interfaceC09390do), R.id.iglive_label_layout, 8);
        MSY.A0z(AbstractC166987dD.A0d(interfaceC09390do), R.id.iglive_view_count_container, 8);
        MSY.A0z(AbstractC166987dD.A0d(interfaceC09390do), R.id.iglive_header_close, 8);
        AbstractC50522MSa.A12(AbstractC167007dF.A0L(this.A0C), this);
    }

    public final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41551w4 c41551w4) {
        int i;
        String quantityString;
        int i2;
        int i3;
        java.util.Set A06;
        Reel reel = c41551w4.A0H;
        C105824pt c105824pt = reel.A0H;
        if (c105824pt != null) {
            if (!c41551w4.A0C) {
                SegmentedProgressBar segmentedProgressBar = (SegmentedProgressBar) AbstractC166987dD.A17(this.A0D);
                segmentedProgressBar.setSegments(1);
                segmentedProgressBar.A06(0, false);
                segmentedProgressBar.setProgress(0.0f);
                ImageUrl A02 = c105824pt.A02();
                if (A02 != null) {
                    ((IgImageView) AbstractC166987dD.A17(this.A0E)).setUrl(A02, interfaceC11380iw);
                }
                IgImageView igImageView = (IgImageView) AbstractC166987dD.A17(this.A07);
                User user = c105824pt.A09;
                user.getClass();
                AbstractC31173DnH.A1T(interfaceC11380iw, igImageView, user);
                TextView A062 = AbstractC37302Gc3.A06(this.A09);
                User user2 = c105824pt.A09;
                user2.getClass();
                AbstractC31173DnH.A1F(A062, user2);
                C55047OZy c55047OZy = C55047OZy.A00;
                C72993Pa c72993Pa = (C72993Pa) this.A0A.getValue();
                C14360o3.A0B(c72993Pa, 0);
                c55047OZy.A01(interfaceC11380iw, c72993Pa, new C3PN(userSession, new C3G4(null, reel, C3G2.A1L)), 2.0684931f, true);
                C105824pt c105824pt2 = reel.A0H;
                if (c105824pt2 != null && (A06 = c105824pt2.A06()) != null) {
                    i = A06.size();
                } else {
                    i = 0;
                }
                InterfaceC09390do interfaceC09390do = this.A0B;
                TextView A063 = AbstractC37302Gc3.A06(interfaceC09390do);
                String str = null;
                Resources resources = AbstractC167007dF.A0L(interfaceC09390do).getResources();
                if (i == 0) {
                    C105824pt c105824pt3 = reel.A0H;
                    if (c105824pt3 != null) {
                        User user3 = c105824pt3.A09;
                        user3.getClass();
                        str = user3.getUsername();
                    }
                    quantityString = AbstractC166997dE.A0r(resources, str, 2131964038);
                } else {
                    C105824pt c105824pt4 = reel.A0H;
                    if (c105824pt4 != null) {
                        User user4 = c105824pt4.A09;
                        user4.getClass();
                        str = user4.getUsername();
                    }
                    quantityString = resources.getQuantityString(R.plurals.iglive_chain_preview_main_text_with_guest, i, AbstractC25228BEl.A1Z(str, i));
                }
                A063.setText(quantityString);
                InterfaceC09390do interfaceC09390do2 = this.A0G;
                TextView A064 = AbstractC37302Gc3.A06(interfaceC09390do2);
                Resources resources2 = AbstractC167007dF.A0L(interfaceC09390do2).getResources();
                C105824pt c105824pt5 = reel.A0H;
                if (c105824pt5 != null) {
                    i2 = c105824pt5.A00();
                    i3 = c105824pt5.A00();
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                A064.setText(resources2.getQuantityString(R.plurals.iglive_chain_preview_whos_watching_text, i2, AbstractC25228BEl.A1Y(i3)));
                AbstractC43593JPy.A1W(this.A06, 0);
                return;
            }
            AbstractC43593JPy.A1Q(this.A06.getValue());
        }
    }

    @Override // X.C3PE
    public final void DQY(View view) {
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        C14360o3.A0B(view, 0);
        if (view.equals(AbstractC166987dD.A17(this.A0C))) {
            C50947MfG c50947MfG = this.A00;
            if (c50947MfG == null) {
                C14360o3.A0F("viewModel");
                throw C00O.createAndThrow();
            }
            PYu.A01(c50947MfG, AbstractC141776au.A00(c50947MfG), 1);
            return true;
        }
        return true;
    }
}
