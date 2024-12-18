package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107314sc extends AbstractC51572Yf {
    public static final InterfaceC89793zL A04;
    public final long A00;
    public final C9BH A01;
    public final UserSession A02;
    public final C76853cX A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C107324sd.A00);
        C77123cy A002 = AbstractC77063cs.A00(c76223bS, C107334se.A00);
        Number number = (Number) A00.A03;
        String A0O = AnonymousClass001.A0O("subtitle_transition_key", number.intValue());
        long j = this.A03.A0C.A03.A00;
        C77123cy A003 = AbstractC77063cs.A00(c76223bS, C107344sf.A00);
        List list = (List) this.A01.A00;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(AnonymousClass001.A0O("subtitle_transition_key", i));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C89813zN A01 = AbstractC51432Xq.A01(EnumC76913cd.GLOBAL, (String[]) Arrays.copyOf(strArr, strArr.length));
        A01.A03(AbstractC79463gt.A05);
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        A01.A04(C89893zV.A00(context, -5));
        A01.A05(C89893zV.A00(context, 5));
        InterfaceC89793zL interfaceC89793zL = A04;
        A01.A02 = interfaceC89793zL;
        A01.A03(AbstractC79463gt.A00);
        A01.A01(0.0f);
        A01.A02(0.0f);
        A01.A02 = interfaceC89793zL;
        AbstractC89903zW.A00(c76223bS, A01);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv c51722Yv = new C51722Yv(null, new C9CV(C05F.A02, C107354sg.A00, 4));
        EnumC77683ds enumC77683ds = EnumC77683ds.STRETCH;
        Integer num = C05F.A00;
        C51722Yv c51722Yv2 = new C51722Yv(c51722Yv, new C9CV(num, enumC77683ds, 3));
        Integer num2 = C05F.A01;
        C51722Yv c51722Yv3 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(c51722Yv2, new C9CT(num2, 1.0f, 1)), new C9CV(C05F.A1F, new C206849Dp(this, 32), 4)), new C77863eE(num, new C107364sh(A002, A00, this, j), null)), new C77863eE(num2, new C207179Ew(21, A003, A002), null));
        C2Z0 c2z0 = new C2Z0(c2xe, new ArrayList());
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C43R c43r = (C43R) obj;
            if (i2 == number.intValue()) {
                String A0O2 = AnonymousClass001.A0O("subtitle_component_key_", i2);
                C51722Yv c51722Yv4 = c43r.A03;
                C14360o3.A0B(c51722Yv4, 0);
                C9CV c9cv = new C9CV(num, enumC77683ds, 3);
                if (c51722Yv4 == c75933ay) {
                    c51722Yv4 = null;
                }
                C51722Yv c51722Yv5 = new C51722Yv(c51722Yv4, c9cv);
                CharSequence charSequence = c43r.A04;
                int i4 = c43r.A00;
                TextUtils.TruncateAt truncateAt = c43r.A01;
                InterfaceC16660sJ interfaceC16660sJ = c43r.A07;
                InterfaceC16820sZ interfaceC16820sZ = c43r.A06;
                InterfaceC16820sZ interfaceC16820sZ2 = c43r.A05;
                InterfaceC16620sF interfaceC16620sF = c43r.A08;
                EnumC77673dr enumC77673dr = c43r.A02;
                C14360o3.A0B(charSequence, 0);
                C14360o3.A0B(truncateAt, 2);
                C43S c43s = new C43S(A003, this.A02, new C43R(truncateAt, enumC77673dr, c51722Yv5, charSequence, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, interfaceC16620sF, i4), A0O, i2, this.A00);
                AbstractC107374si.A01(c43s, A0O2);
                c2z0.A00(c43s);
            }
            i2 = i3;
        }
        return AbstractC76963ci.A06(c2z0, c76223bS, c51722Yv3, null, null, null, false);
    }

    static {
        InterfaceC89793zL interfaceC89793zL = AbstractC51432Xq.A01;
        A04 = new C89803zM(500);
    }

    public C107314sc(C9BH c9bh, UserSession userSession, C76853cX c76853cX, long j) {
        this.A03 = c76853cX;
        this.A01 = c9bh;
        this.A02 = userSession;
        this.A00 = j;
    }
}
