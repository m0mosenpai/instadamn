package X;

import android.app.Application;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.autocreatedclips.repository.ClipsSoundSyncMediaImportRepository;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class OX1 {
    public List A00;
    public boolean A01;
    public final Application A02;
    public final InterfaceC58362lv A03;
    public final C22P A04;
    public final C26086BgF A05;
    public final C185358Kb A06;
    public final UserSession A07;
    public final ClipsSoundSyncMediaImportRepository A08;
    public final C84G A09;
    public final ClipsCreationViewModel A0A;
    public final List A0B;
    public final List A0C;
    public final C19L A0D;
    public final InterfaceC24731Iq A0E;
    public final InterfaceC19390xP A0F;
    public final C05A A0G;
    public final C05A A0H;
    public final C05A A0I;
    public final C05A A0J;
    public final C55U A0K;

    public OX1(Application application, C22P c22p, C26086BgF c26086BgF, UserSession userSession, C55U c55u, ClipsSoundSyncMediaImportRepository clipsSoundSyncMediaImportRepository, ClipsCreationViewModel clipsCreationViewModel, List list, List list2, C19L c19l) {
        C14360o3.A0B(c55u, 9);
        this.A02 = application;
        this.A07 = userSession;
        this.A0A = clipsCreationViewModel;
        this.A08 = clipsSoundSyncMediaImportRepository;
        this.A0B = list;
        this.A0D = c19l;
        this.A05 = c26086BgF;
        this.A0K = c55u;
        this.A0C = list2;
        this.A04 = c22p;
        C84G c84g = AnonymousClass849.A00(application, userSession).A00(clipsCreationViewModel.A0S).A05;
        this.A09 = c84g;
        this.A0I = AbstractC25225BEi.A1H(false);
        this.A0H = AbstractC25225BEi.A1H(false);
        this.A0G = AbstractC25225BEi.A1H(false);
        this.A0J = AbstractC25225BEi.A1H(MSY.A0Y());
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A0E = c24721Ip;
        this.A06 = ((C22931A9b) userSession.A01(C22931A9b.class, C57531Pg5.A00(application, userSession, 1))).A00;
        this.A0F = AbstractC07080Za.A03(c24721Ip);
        MY1 my1 = new MY1(this, 22);
        this.A03 = my1;
        AbstractC43593JPy.A1X(new D51(this, (InterfaceC23621Ds) null, 46), c19l, c84g.A03);
        clipsCreationViewModel.A0K.A06.A09(my1);
    }

    public static final C195868lW A00(Medium medium, OX1 ox1) {
        try {
            C195868lW call = new CallableC209459Oe(ox1.A02, medium, ox1.A07, false).call();
            int i = call.A09;
            if (i == 90 || i == 270) {
                return new C195868lW(medium, call.A08, call.A0K, i);
            }
            return call;
        } catch (Exception unused) {
            return new C195868lW(medium, medium.A0B, medium.A04, medium.A07);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00fe -> B:22:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0138 -> B:10:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OX1.A01(X.1Ds, boolean):java.lang.Object");
    }

    public final ArrayList A02() {
        List list = this.A0B;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1W(A0q, MSX.A0O(it).A04);
        }
        return AbstractC001800i.A0S(this.A08.A00, A0q);
    }

    public final List A03() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        C14360o3.A0F("media");
        throw C00O.createAndThrow();
    }
}
