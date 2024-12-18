package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.89Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89Y extends AbstractC52922bZ {
    public Drawable A00;
    public InterfaceC110214xq A01;
    public List A02;
    public final C2GT A03;
    public final C89Z A04;
    public final Map A05;
    public final InterfaceC09390do A06;
    public final InterfaceC24731Iq A07;
    public final C05A A08;
    public final UserSession A09;

    public C89Y(C89Z c89z, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A09 = userSession;
        this.A04 = c89z;
        C008002u c008002u = new C008002u(C89W.A03);
        this.A08 = c008002u;
        this.A06 = AbstractC09440dt.A00(EnumC09460dv.A02, new C206879Ds(this, 17));
        this.A02 = C16930sl.A00;
        this.A05 = new LinkedHashMap();
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A07 = c24721Ip;
        this.A03 = AbstractC58232lf.A00(AnonymousClass191.A00, AbstractC07080Za.A03(c24721Ip));
        AbstractC18560vj.A03(AbstractC141776au.A00(this), new C15340po(new C9D3(this, null, 20), c008002u));
    }

    public final List A00(int i) {
        InterfaceC110164xl C8Y;
        List C6M;
        InterfaceC110214xq interfaceC110214xq = this.A01;
        if (interfaceC110214xq != null && (C8Y = interfaceC110214xq.C8Y()) != null && (C6M = C8Y.C6M()) != null && (!C6M.isEmpty())) {
            ArrayList<InterfaceC93104Fm> arrayList = new ArrayList();
            for (Object obj : C6M) {
                if (((InterfaceC93104Fm) obj).Bzo() < i) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            for (InterfaceC93104Fm interfaceC93104Fm : arrayList) {
                C22998ABx AKh = interfaceC93104Fm.AKh();
                AKh.A01 = interfaceC93104Fm.Bzo();
                AKh.A00 = Math.min(i, interfaceC93104Fm.B27());
                arrayList2.add(AKh.A00());
            }
            return arrayList2;
        }
        return null;
    }
}
