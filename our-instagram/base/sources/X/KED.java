package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.base.MediaSession;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KED extends C7E1 implements InterfaceC152956uP {
    public final AnonymousClass840 A00;
    public final C45535KEa A01;
    public final KEZ A02;
    public final KEX A03;
    public final C38U A04;
    public final Map A06 = AbstractC166987dD.A1G();
    public final List A05 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        return AbstractC37304Gc5.A0G(str, this.A06);
    }

    public KED(final Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, AnonymousClass840 anonymousClass840, final InterfaceC189598ae interfaceC189598ae, C38U c38u, float f) {
        this.A00 = anonymousClass840;
        this.A04 = c38u;
        final AnonymousClass841 A00 = anonymousClass840.A00();
        interfaceC189598ae.EDa(new Runnable() { // from class: X.M6E
            @Override // java.lang.Runnable
            public final void run() {
                List list;
                KzE kzE;
                Context applicationContext;
                int i;
                String str;
                KED ked = this;
                AnonymousClass841 anonymousClass841 = A00;
                InterfaceC189598ae interfaceC189598ae2 = interfaceC189598ae;
                Context context2 = context;
                if (anonymousClass841.CPp()) {
                    C47Z BcC = interfaceC189598ae2.BcC(((MX5) anonymousClass841).A01.A0C);
                    C47Z BcC2 = interfaceC189598ae2.BcC(JQ1.A0M(anonymousClass841, 0));
                    String A002 = MSV.A00(1484);
                    if (BcC2 == null) {
                        AbstractC12120kG.A01("MediaPreviewAdapter", AnonymousClass001.A0u("firstMedia is null and path for media type video mediasession", ((MediaSession) anonymousClass841.CpK().get(0)).B6E(), A002, JQ1.A0M(anonymousClass841, 0)));
                        applicationContext = context2.getApplicationContext();
                        i = 2131974293;
                        str = "first_media_is_null";
                    } else {
                        String str2 = BcC2.A33;
                        if (str2 == null) {
                            AbstractC12120kG.A01("MediaPreviewAdapter", AnonymousClass001.A0u("firstMedia thumbnail is null", ((MediaSession) anonymousClass841.CpK().get(0)).B6E(), A002, JQ1.A0M(anonymousClass841, 0)));
                            applicationContext = context2.getApplicationContext();
                            i = 2131974293;
                            str = "first_media_thumbnail_is_null";
                        } else {
                            SimpleImageUrl A0Q = AbstractC43593JPy.A0Q(str2);
                            list = ked.A05;
                            kzE = new KzE(A0Q, BcC);
                            list.add(kzE);
                        }
                    }
                    C9GR.A01(applicationContext, str, i, 0);
                    return;
                }
                C47Z BcC3 = interfaceC189598ae2.BcC(anonymousClass841.E3z());
                BcC3.getClass();
                String str3 = BcC3.A33;
                if (str3 == null) {
                    applicationContext = context2.getApplicationContext();
                    i = 2131974293;
                    str = "media_thumbnail_is_null";
                    C9GR.A01(applicationContext, str, i, 0);
                    return;
                }
                SimpleImageUrl A0Q2 = AbstractC43593JPy.A0Q(str3);
                list = ked.A05;
                kzE = new KzE(A0Q2, BcC3);
                list.add(kzE);
            }
        });
        C45535KEa c45535KEa = new C45535KEa(context, interfaceC11380iw, userSession, interfaceC189598ae, f);
        this.A01 = c45535KEa;
        KEX kex = new KEX();
        this.A03 = kex;
        KEZ kez = new KEZ(interfaceC11380iw, userSession, c38u);
        this.A02 = kez;
        A0B(c45535KEa, kex, kez);
    }

    public final void A0C() {
        A06();
        A08(this.A01, this.A00);
        List list = this.A05;
        if (list.size() > 1) {
            A08(this.A03, null);
            int size = list.size() / 3;
            for (int i = 0; i < size; i++) {
                Object c153126ug = new C153126ug(list, i * 3, 3);
                C153336v2 A0G = AbstractC37304Gc5.A0G(AbstractC166997dE.A0u(c153126ug), this.A06);
                A0G.A00(i, AbstractC167007dF.A1P(i, size - 1));
                A09(this.A02, c153126ug, A0G);
            }
        }
        A07();
    }
}
