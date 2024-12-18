package X;

import com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jmz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44553Jmz extends AbstractC52922bZ {
    public boolean A00;
    public final C26069Bfx A01;
    public final C47983LJh A02;
    public final C47241KuE A03;
    public final C27V A04;
    public final C46610Kjn A05;
    public final AppreciationGiftFeedRepository A06;
    public final InterfaceC24731Iq A07;
    public final InterfaceC19390xP A08;
    public final C05A A09;
    public final C0UO A0A;

    public C44553Jmz(C26069Bfx c26069Bfx, C47983LJh c47983LJh, C47241KuE c47241KuE, C27V c27v, C46610Kjn c46610Kjn, AppreciationGiftFeedRepository appreciationGiftFeedRepository) {
        C14360o3.A0B(c27v, 5);
        this.A06 = appreciationGiftFeedRepository;
        this.A05 = c46610Kjn;
        this.A01 = c26069Bfx;
        this.A02 = c47983LJh;
        this.A04 = c27v;
        this.A03 = c47241KuE;
        C008002u A00 = C10E.A00(C48231LWg.A00);
        this.A09 = A00;
        this.A0A = AbstractC208910l.A02(A00);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A07 = A12;
        this.A08 = AbstractC07080Za.A03(A12);
        MCD.A02(this, AbstractC141776au.A00(this), 40);
    }

    public final void setViewStateForTest(InterfaceC50390MMs interfaceC50390MMs) {
        C14360o3.A0B(interfaceC50390MMs, 0);
        this.A09.Egh(interfaceC50390MMs);
    }

    public static final C26059Bfm A00(C44553Jmz c44553Jmz) {
        InterfaceC50390MMs interfaceC50390MMs = (InterfaceC50390MMs) c44553Jmz.A09.getValue();
        if (C45161Jz1.A00(interfaceC50390MMs, 1)) {
            return (C26059Bfm) ((C45161Jz1) interfaceC50390MMs).A01;
        }
        return null;
    }

    public static final List A01(C26059Bfm c26059Bfm) {
        List list;
        if (c26059Bfm != null && (list = (List) c26059Bfm.A03) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(((C45062Jwr) it.next()).A06);
            }
            return A0q;
        }
        return null;
    }

    public static final boolean A02(List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C45094JxO) it.next()).A01 != -1) {
                return true;
            }
        }
        return false;
    }

    public final Long A03() {
        long j = this.A06.A00;
        if (j == -1) {
            return null;
        }
        return Long.valueOf(j);
    }
}
