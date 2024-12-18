package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.84n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1817884n {
    public final List A00;
    public final InterfaceC06180Ui A03;
    public final InterfaceC06180Ui A04;
    public final InterfaceC06180Ui A05;
    public final InterfaceC06180Ui A06;
    public final InterfaceC06180Ui A07;
    public final InterfaceC06180Ui A08;
    public final InterfaceC06180Ui A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C0UO A0D;
    public final C0UO A0E;
    public final UserSession A0F;
    public final C0UO A0G;
    public final List A02 = new ArrayList();
    public final List A01 = new ArrayList();

    public C1817884n(UserSession userSession) {
        List arrayList;
        this.A0F = userSession;
        if (C18U.A06(C06090Tz.A05, userSession, 36330720336430072L)) {
            arrayList = new CopyOnWriteArrayList();
        } else {
            arrayList = new ArrayList();
        }
        this.A00 = arrayList;
        C008002u c008002u = new C008002u(new ArrayList());
        this.A0C = c008002u;
        this.A0E = c008002u;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A0B = A00;
        this.A0D = A00;
        C008002u A002 = C10E.A00(c16930sl);
        this.A0A = A002;
        this.A0G = A002;
        Integer num = C05F.A01;
        this.A05 = C10M.A00(num, 0, 1);
        this.A06 = C10M.A00(num, 0, 1);
        this.A03 = C10M.A00(num, 0, 1);
        this.A04 = C10M.A00(num, 0, 1);
        this.A07 = C10M.A00(num, 0, 1);
        this.A08 = C10M.A00(num, 0, 1);
        this.A09 = C10M.A00(num, 0, 1);
    }

    public static final void A00(C1817884n c1817884n, Object obj, Object obj2) {
        boolean z;
        if (obj instanceof C5RO) {
            z = obj2 instanceof C5RO;
        } else if (!(obj instanceof C5RR)) {
            return;
        } else {
            z = obj2 instanceof C5RR;
        }
        if (z) {
            c1817884n.A07.F8m(new C09530e4(obj, obj2));
        }
    }

    public final void A01(C5RO c5ro) {
        AbstractC183338Bg.A00(this.A0F).A0A("ClipsTimedStickerStore#addTimedSticker");
        List list = this.A02;
        list.add(c5ro);
        this.A0C.Egh(new ArrayList(list));
        if (c5ro instanceof Drawable) {
            this.A05.F8m(c5ro);
        }
    }
}
