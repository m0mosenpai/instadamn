package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4jo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102554jo {
    public final InterfaceC19630xq A02;
    public final Object A03 = new Object();
    public Integer A01 = C05F.A00;
    public int A00 = 0;
    public volatile String A04 = null;

    public final void A00(final AbstractC12990ll abstractC12990ll, final String str, final String str2, boolean z) {
        synchronized (this.A03) {
            if (this.A01 != C05F.A00) {
                if (z) {
                    this.A01 = C05F.A0C;
                }
                return;
            }
            Integer num = C05F.A01;
            this.A01 = num;
            this.A04 = str2;
            C25621Ms c25621Ms = new C25621Ms(abstractC12990ll);
            c25621Ms.A09(num);
            c25621Ms.A0B("zr/dual_tokens/");
            c25621Ms.A9s("normal_token_hash", str);
            c25621Ms.A9s(AbstractC50532MSl.A01(0, 9, 53), C16030qx.A00(AbstractC12290kX.A00));
            c25621Ms.A9s("custom_device_id", C16030qx.A02.A05(AbstractC12290kX.A00));
            c25621Ms.A9s("fetch_reason", str2);
            c25621Ms.A0S(C102604jt.class, C102614ju.class);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C1P1(abstractC12990ll, this, str, str2) { // from class: X.4jv
                public final AbstractC12990ll A00;
                public final String A01;
                public final String A02;
                public final /* synthetic */ C102554jo A03;

                {
                    this.A03 = this;
                    this.A02 = str;
                    this.A00 = abstractC12990ll;
                    this.A01 = str2;
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                    int intValue;
                    int i;
                    Integer num2;
                    int i2;
                    String property;
                    int A03 = C0f9.A03(127955381);
                    int A032 = C0f9.A03(-989194284);
                    C103604lc c103604lc = ((C102604jt) obj).A00;
                    if (c103604lc == null) {
                        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                        throw C00O.createAndThrow();
                    }
                    C103574lZ c103574lZ = c103604lc.A00;
                    if (c103574lZ == null) {
                        C0K8.A0C("IgZeroTokenFetcher", "Got campaign API response with an empty normal token");
                        i2 = 1097643103;
                    } else {
                        C102554jo c102554jo = this.A03;
                        Integer num3 = null;
                        if ("true".equals(System.getProperty("is_e2e_testing")) && (property = System.getProperty("fb.e2e.ZERO_TTL_OVERRIDE")) != null) {
                            num3 = Integer.valueOf(Integer.parseInt(property));
                        }
                        String str3 = c103574lZ.A05;
                        String str4 = c103574lZ.A03;
                        String str5 = c103574lZ.A04;
                        List list = c103574lZ.A09;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            try {
                                C103554lX c103554lX = (C103554lX) ((InterfaceC103564lY) it.next());
                                arrayList.add(new C26691Qy(c103554lX.A00, c103554lX.A01));
                            } catch (C90143zv e) {
                                C0w9.A03("IgZeroTokenFetcher", "Invalid zero rating rewrite rule");
                                C0K8.A0G("IgZeroTokenFetcher", MSV.A00(799), e);
                            }
                        }
                        List emptyList = Collections.emptyList();
                        HashSet A033 = AbstractC103614ld.A03(c103574lZ.A08);
                        java.util.Set stringSet = c102554jo.A02.getStringSet("zero_overridden_features", null);
                        if (stringSet != null) {
                            A033 = new C25021B4y(c102554jo, A033, stringSet);
                        }
                        java.util.Set unmodifiableSet = Collections.unmodifiableSet(A033);
                        if (num3 == null) {
                            intValue = c103574lZ.A00;
                        } else {
                            intValue = num3.intValue();
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        int parseInt = Integer.parseInt(c103574lZ.A02);
                        java.util.Set unmodifiableSet2 = Collections.unmodifiableSet(AbstractC103614ld.A03(c103574lZ.A07));
                        int i3 = c103574lZ.A01;
                        List<URW> list2 = c103574lZ.A06;
                        ArrayList arrayList2 = new ArrayList();
                        for (URW urw : list2) {
                            arrayList2.add(new C62723SNn(urw.A01, urw.A02, urw.A00));
                        }
                        C1R0 c1r0 = new C1R0(new C26701Qz(arrayList2), str3, str4, str5, null, "", arrayList, emptyList, unmodifiableSet, unmodifiableSet2, intValue, parseInt, i3, currentTimeMillis);
                        try {
                            c102554jo.A00 = 0;
                            AbstractC12990ll abstractC12990ll2 = this.A00;
                            C26661Qv.A00(abstractC12990ll2).FCf(c1r0);
                            String str6 = c1r0.A06;
                            if (str6 == null) {
                                str6 = "";
                            }
                            int i4 = c1r0.A00;
                            C14360o3.A0B(abstractC12990ll2, 0);
                            C18920wW A01 = AbstractC12220kQ.A01(null, abstractC12990ll2);
                            InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_zero_token_fetch_success");
                            A00.A8p("carrier_id", Integer.valueOf(i4));
                            A00.AAP("carrier_name", str6);
                            A00.Cht();
                            synchronized (c102554jo.A03) {
                                try {
                                    num2 = c102554jo.A01;
                                    c102554jo.A01 = C05F.A00;
                                } catch (Throwable th) {
                                    th = th;
                                    i = 867246409;
                                    C0f9.A0A(i, A032);
                                    throw th;
                                }
                            }
                            if (num2 == C05F.A0C) {
                                c102554jo.A00(abstractC12990ll2, this.A02, this.A01, false);
                            }
                            i2 = -2125129546;
                        } catch (Throwable th2) {
                            th = th2;
                            synchronized (c102554jo.A03) {
                                try {
                                    Integer num4 = c102554jo.A01;
                                    c102554jo.A01 = C05F.A00;
                                    if (num4 == C05F.A0C) {
                                        c102554jo.A00(this.A00, this.A02, this.A01, false);
                                    }
                                    i = -1762050632;
                                } catch (Throwable th3) {
                                    th = th3;
                                    i = -853113922;
                                }
                            }
                        }
                    }
                    C0f9.A0A(i2, A032);
                    C0f9.A0A(549330914, A03);
                }

                @Override // X.C1P1
                public final void onFail(AbstractC115105If abstractC115105If) {
                    Integer num2;
                    int A03 = C0f9.A03(95291059);
                    if (abstractC115105If instanceof C115115Ig) {
                        ((InterfaceC40821up) ((C115115Ig) abstractC115105If).A00).getErrorMessage();
                    } else {
                        Throwable A01 = abstractC115105If.A01();
                        if (A01 != null) {
                            A01.toString();
                        }
                    }
                    C102554jo c102554jo = this.A03;
                    synchronized (c102554jo.A03) {
                        try {
                            num2 = c102554jo.A01;
                            c102554jo.A01 = C05F.A00;
                        } catch (Throwable th) {
                            C0f9.A0A(1958052864, A03);
                            throw th;
                        }
                    }
                    if (num2 == C05F.A0C) {
                        c102554jo.A00 = 0;
                    } else {
                        int i = c102554jo.A00;
                        if (i < 1) {
                            c102554jo.A00 = i + 1;
                        } else {
                            c102554jo.A00 = 0;
                            C0f9.A0A(699997629, A03);
                        }
                    }
                    c102554jo.A00(this.A00, this.A02, this.A01, false);
                    C0f9.A0A(699997629, A03);
                }
            };
            C1GJ.A03(A0N);
        }
    }

    public C102554jo(AbstractC12990ll abstractC12990ll) {
        InterfaceC19630xq A01;
        if (abstractC12990ll instanceof UserSession) {
            A01 = C1AT.A01((UserSession) abstractC12990ll).A03(C1AV.A3f);
        } else {
            A01 = AbstractC19750y3.A01("PrefZeroRatingDebugFilename");
        }
        this.A02 = A01;
    }
}
