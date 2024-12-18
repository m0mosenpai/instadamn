package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import java.util.List;

/* renamed from: X.8hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193798hz implements InterfaceC153786vn {
    public long A00;
    public C6WQ A01;
    public AnonymousClass195 A02;
    public final View A03;
    public final AbstractC59962oe A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
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
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC16820sZ A0J;
    public final C1810981l A0K;

    public C193798hz(View view, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(view, 5);
        this.A04 = abstractC59962oe;
        this.A06 = userSession;
        this.A0K = c1810981l;
        this.A05 = interfaceC11380iw;
        this.A03 = view;
        this.A0J = interfaceC16820sZ;
        this.A07 = C1XM.A00(new C9EO(this, 13));
        this.A0H = AbstractC09440dt.A01(new C9EO(this, 23));
        C9EO c9eo = new C9EO(this, 19);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EO(new C9EO(abstractC59962oe, 25), 26));
        this.A0D = new C60842q8(new C9EO(A00, 27), c9eo, new C9F7(7, null, A00), new C0YZ(QuickSnapArchiveViewModel.class));
        this.A0F = C1XM.A00(new C9EO(this, 21));
        this.A0I = C1XM.A00(new C9EO(this, 24));
        this.A0G = C1XM.A00(new C9EO(this, 22));
        this.A09 = C1XM.A00(new C9EO(this, 15));
        this.A0C = C1XM.A00(new C9EO(this, 18));
        this.A0B = C1XM.A00(new C9EO(this, 17));
        this.A0A = C1XM.A00(new C9EO(this, 16));
        this.A08 = C1XM.A00(new C9EO(this, 14));
        this.A0E = C1XM.A00(new C9EO(this, 20));
    }

    public static final void A00(IgSimpleImageView igSimpleImageView, C193798hz c193798hz, boolean z) {
        Context context = c193798hz.A04.getContext();
        if (context != null) {
            igSimpleImageView.setEnabled(z);
            int i = R.attr.igds_color_secondary_text_on_media;
            if (z) {
                i = R.attr.igds_color_primary_text_on_media;
            }
            int color = context.getColor(AbstractC53242c7.A0H(context, i));
            TypedValue typedValue = AbstractC85953sP.A00;
            igSimpleImageView.setColorFilter(C3DY.A00(color));
        }
    }

    public static final boolean A01(C193798hz c193798hz) {
        if (c193798hz.A0K.A08.A00 != C81R.A00) {
            return false;
        }
        return true;
    }

    public final void A02() {
        Object value;
        List list;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        Object value2 = this.A08.getValue();
        C14360o3.A07(value2);
        ((View) value2).setVisibility(8);
        QuickSnapArchiveViewModel quickSnapArchiveViewModel = (QuickSnapArchiveViewModel) this.A0D.getValue();
        C05A c05a = quickSnapArchiveViewModel.A0F;
        do {
            value = c05a.getValue();
            C51705Msa c51705Msa = (C51705Msa) value;
            list = c51705Msa.A01;
            z = c51705Msa.A02;
            z2 = c51705Msa.A04;
            z3 = c51705Msa.A05;
            z4 = c51705Msa.A0B;
            z5 = c51705Msa.A07;
            z6 = c51705Msa.A06;
            i = c51705Msa.A00;
            C14360o3.A0B(list, 0);
        } while (!c05a.AIi(value, new C51705Msa(list, i, z, false, z2, false, false, false, z3, z4, z5, z6)));
        QuickSnapArchiveViewModel.A02(quickSnapArchiveViewModel);
        AnonymousClass195 anonymousClass195 = this.A02;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A02 = null;
    }

    @Override // X.InterfaceC153786vn
    public final InterfaceC127925qL BAO(int i) {
        InterfaceC127925qL BAO = ((C194218ig) this.A07.getValue()).BAO(i);
        C14360o3.A07(BAO);
        return BAO;
    }
}
