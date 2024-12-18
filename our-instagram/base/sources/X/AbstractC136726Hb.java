package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;

/* renamed from: X.6Hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136726Hb {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C5Hc c5Hc, int i, int i2) {
        int i3;
        C117505Tk c117505Tk;
        Modifier modifier2 = modifier;
        C14360o3.A0B(c5Hc, 0);
        c5Tl.Enr(-344039711);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i4 = 2;
            if (c5Tl.AH4(c5Hc)) {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i6 = 16;
            if (c5Tl.AH4(modifier)) {
                i6 = 32;
            }
            i3 |= i6;
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1099938932, "com.instagram.barcelona.feed.post.ui.PostReplyFacepile (PostReplyFacepile.kt:33)");
            }
            int size = c5Hc.size();
            if (size != 0) {
                if (size != 1) {
                    if (size != 2) {
                        c5Tl.Eno(169902244);
                        InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0E, false);
                        int A002 = C5X2.A00(c5Tl);
                        c117505Tk = (C117505Tk) c5Tl;
                        C59P A04 = C117505Tk.A04(c117505Tk);
                        Modifier A01 = C5X3.A01(c5Tl, modifier2);
                        InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
                        c5Tl.Ent();
                        if (c117505Tk.A0K) {
                            c5Tl.AMd(interfaceC16820sZ);
                        } else {
                            c5Tl.FDO();
                        }
                        C5XJ.A00(c5Tl, A00, C5X8.A03);
                        C5XJ.A00(c5Tl, A04, C5X8.A05);
                        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                        if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A002))) {
                            Integer valueOf = Integer.valueOf(A002);
                            c5Tl.FBy(valueOf);
                            c5Tl.ABx(valueOf, interfaceC16620sF);
                        }
                        C5XJ.A00(c5Tl, A01, C5X8.A04);
                        ImageUrl imageUrl = (ImageUrl) c5Hc.get(0);
                        C1130158n c1130158n = Modifier.A00;
                        Modifier A0C = AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(c1130158n, 16.0f, 2.0f, 0.0f, 0.0f), 18.0f);
                        C5WI c5wi = C5WF.A00;
                        AbstractC136656Gu.A02(c5Tl, C6L2.A01(A0C, c5wi), imageUrl);
                        AbstractC136656Gu.A02(c5Tl, C6L2.A01(AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(c1130158n, 0.0f, 11.0f, 0.0f, 0.0f), 12.0f), c5wi), (ImageUrl) c5Hc.get(1));
                        AbstractC136656Gu.A02(c5Tl, C6L2.A01(AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(c1130158n, 13.0f, 23.0f, 0.0f, 0.0f), 9.0f), c5wi), (ImageUrl) c5Hc.get(2));
                    } else {
                        c5Tl.Eno(169319134);
                        int i7 = (((i3 >> 3) & 14) | 48) >> 3;
                        InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01(-10.0f), c5Tl, C118195Wf.A05, (i7 & 112) | (i7 & 14));
                        int A003 = C5X2.A00(c5Tl);
                        c117505Tk = (C117505Tk) c5Tl;
                        C59P A042 = C117505Tk.A04(c117505Tk);
                        Modifier A012 = C5X3.A01(c5Tl, modifier2);
                        InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
                        c5Tl.Ent();
                        if (c117505Tk.A0K) {
                            c5Tl.AMd(interfaceC16820sZ2);
                        } else {
                            c5Tl.FDO();
                        }
                        C5XJ.A00(c5Tl, A02, C5X8.A03);
                        C5XJ.A00(c5Tl, A042, C5X8.A05);
                        InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                        if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A003))) {
                            Integer valueOf2 = Integer.valueOf(A003);
                            c5Tl.FBy(valueOf2);
                            c5Tl.ABx(valueOf2, interfaceC16620sF2);
                        }
                        C5XJ.A00(c5Tl, A012, C5X8.A04);
                        Modifier A0C2 = AbstractC118185Wd.A0C(Modifier.A00, 20.0f);
                        C6KV A004 = C6G9.A00(2.0f, ((C1132359l) C5UT.A01(AbstractC25646BVi.A00, C117505Tk.A04(c117505Tk))).A00);
                        C5WI c5wi2 = C5WF.A00;
                        Modifier A013 = C6L2.A01(AbstractC118175Wb.A08(C6L7.A01(A004, A0C2, c5wi2), 2.0f), c5wi2);
                        c5Tl.Eno(867986796);
                        Iterator it = c5Hc.iterator();
                        while (it.hasNext()) {
                            AbstractC136656Gu.A02(c5Tl, A013, (ImageUrl) it.next());
                        }
                        C117505Tk.A0L(c117505Tk, false);
                    }
                    C117505Tk.A0L(c117505Tk, true);
                } else {
                    c5Tl.Eno(169133909);
                    AbstractC136656Gu.A02(c5Tl, C6L2.A01(AbstractC118185Wd.A0C(modifier2, 18.0f), C5WF.A00), (ImageUrl) c5Hc.get(0));
                }
            } else {
                c5Tl.Eno(169092958);
                C5XX.A02(c5Tl, modifier2, (i3 >> 3) & 14);
            }
            C117505Tk.A0L((C117505Tk) c5Tl, false);
            if (C0fH.A02()) {
                C0fH.A00(299840175);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30504Dbn(modifier2, i2, c5Hc, i, 17);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, C5Hc c5Hc, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(c5Hc, 1);
        c5Tl.Enr(51753465);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i4 = 2;
            if (c5Tl.AH5(z)) {
                i4 = 4;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i5 = 16;
            if (c5Tl.AH4(c5Hc)) {
                i5 = 32;
            }
            i3 |= i5;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i7 = 128;
            if (c5Tl.AH4(modifier2)) {
                i7 = 256;
            }
            i3 |= i7;
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1688507349, "com.instagram.barcelona.feed.post.ui.PostInlineExpansionIndicator (PostReplyFacepile.kt:88)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0C = AbstractC118185Wd.A0C(c1130158n, 20.0f);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C6L4 c6l4 = new C6L4(((C1132359l) C5UT.A01(AbstractC25646BVi.A00, C117505Tk.A04(c117505Tk))).A00);
            C5WI c5wi = C5WF.A00;
            Modifier A08 = AbstractC118175Wb.A08(C6L7.A02(A0C, c6l4, c5wi, 2.0f), 2.0f);
            int i8 = (((i3 >> 6) & 14) | 48) >> 3;
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01(-10.0f), c5Tl, C118195Wf.A05, (i8 & 112) | (i8 & 14));
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            c5Tl.Ent();
            if (c117505Tk.A0K) {
                c5Tl.AMd(interfaceC16820sZ);
            } else {
                c5Tl.FDO();
            }
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            C5XJ.A00(c5Tl, A02, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A05;
            C5XJ.A00(c5Tl, A04, interfaceC16620sF2);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A00))) {
                Integer valueOf = Integer.valueOf(A00);
                c5Tl.FBy(valueOf);
                c5Tl.ABx(valueOf, interfaceC16620sF3);
            }
            InterfaceC16620sF interfaceC16620sF4 = C5X8.A04;
            C5XJ.A00(c5Tl, A01, interfaceC16620sF4);
            c5Tl.Eno(-354787923);
            int size = c5Hc.size();
            if (size > 2) {
                size = 2;
            }
            for (int i9 = 0; i9 < size; i9++) {
                AbstractC136656Gu.A02(c5Tl, C6L2.A01(A08, c5wi), (ImageUrl) c5Hc.get(i9));
            }
            C117505Tk.A0L(c117505Tk, false);
            if (z) {
                c5Tl.Eno(1886713799);
                AbstractC27548CDt.A00(c5Tl, C6L3.A01(A08, c5wi, C5XL.A00(c5Tl).A0k), null, 0, 2);
            } else {
                c5Tl.Eno(1886858569);
                Modifier A012 = C6L3.A01(A08, c5wi, C5XL.A00(c5Tl).A0o);
                InterfaceC1127857k A002 = C5XX.A00(C118195Wf.A09, false);
                int A003 = C5X2.A00(c5Tl);
                C59P A042 = C117505Tk.A04(c117505Tk);
                Modifier A013 = C5X3.A01(c5Tl, A012);
                c5Tl.Ent();
                if (c117505Tk.A0K) {
                    c5Tl.AMd(interfaceC16820sZ);
                } else {
                    c5Tl.FDO();
                }
                C5XJ.A00(c5Tl, A002, interfaceC16620sF);
                C5XJ.A00(c5Tl, A042, interfaceC16620sF2);
                if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A003))) {
                    Integer valueOf2 = Integer.valueOf(A003);
                    c5Tl.FBy(valueOf2);
                    c5Tl.ABx(valueOf2, interfaceC16620sF3);
                }
                C5XJ.A00(c5Tl, A013, interfaceC16620sF4);
                C5YS.A04(c5Tl, AbstractC118185Wd.A0C(c1130158n, 8.0f), C5Y7.A00(c5Tl, R.drawable.barcelona_arrow_down_outline_08, 0), C5XL.A00(c5Tl).A0k);
                C117505Tk.A0L(c117505Tk, true);
            }
            C117505Tk.A0L(c117505Tk, false);
            C117505Tk.A0L(c117505Tk, true);
            if (C0fH.A02()) {
                C0fH.A00(919793824);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTV(i, i2, 3, modifier2, c5Hc, z);
        }
    }
}
