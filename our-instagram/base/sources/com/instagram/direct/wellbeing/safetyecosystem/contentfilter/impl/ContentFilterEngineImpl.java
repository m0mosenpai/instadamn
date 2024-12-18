package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl;

import X.AbstractC001800i;
import X.AbstractC009903n;
import X.AbstractC09440dt;
import X.AbstractC23641Du;
import X.AnonymousClass139;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.AnonymousClass930;
import X.C05F;
import X.C06090Tz;
import X.C09530e4;
import X.C0eB;
import X.C12N;
import X.C14090nZ;
import X.C14360o3;
import X.C18U;
import X.C19L;
import X.C1JX;
import X.C2044292z;
import X.C9D4;
import X.C9DH;
import X.C9DL;
import X.C9DS;
import X.C9E1;
import X.EnumC124825kn;
import X.EnumC2043192h;
import X.InterfaceC09390do;
import X.InterfaceC13000lm;
import X.InterfaceC2043492k;
import X.InterfaceC2044192x;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class ContentFilterEngineImpl implements InterfaceC2044192x, InterfaceC13000lm {
    public static final Set A0C;
    public static final Set A0D;
    public static final Set A0E;
    public static final Set A0F;
    public AnonymousClass930 A00;
    public final int A01;
    public final UserSession A02;
    public final C2044292z A03;
    public final ContentFilterDictionaryRegistrar A04;
    public final Map A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final AnonymousClass139 A08;
    public final C12N A09;
    public final C14090nZ A0A;
    public final C19L A0B;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (X.AnonymousClass139.A00(r6, r2) == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (((X.C206529Cj) r13).A06 != 2) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f A[Catch: all -> 0x010f, TryCatch #0 {all -> 0x010f, blocks: (B:14:0x0089, B:16:0x008f, B:17:0x0096, B:19:0x0097), top: B:13:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097 A[Catch: all -> 0x010f, TRY_LEAVE, TryCatch #0 {all -> 0x010f, blocks: (B:14:0x0089, B:16:0x008f, B:17:0x0096, B:19:0x0097), top: B:13:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r11, com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl r12, X.InterfaceC23621Ds r13) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl.A00(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl, com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl, X.1Ds):java.lang.Object");
    }

    public final C09530e4 A02(InterfaceC2043492k interfaceC2043492k, String str, boolean z) {
        Set set;
        C14360o3.A0B(interfaceC2043492k, 0);
        if (interfaceC2043492k.Anx() == EnumC2043192h.A05 && this.A00.A00(str)) {
            return new C09530e4(true, "banned_unicode");
        }
        Set set2 = (Set) this.A04.A0B.get(interfaceC2043492k);
        if (set2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : set2) {
                if (((ContentFilterDictionaryImpl) obj).A00 != EnumC124825kn.A08) {
                    arrayList.add(obj);
                }
            }
            set = AbstractC001800i.A0k(arrayList);
        } else {
            set = null;
        }
        return A01(this, str, set, z);
    }

    @Override // X.InterfaceC2044192x
    public final Object DXp(ContentFilterDictionaryImpl contentFilterDictionaryImpl, List list, List list2, InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC23641Du.A00(interfaceC23621Ds, this.A0A, new C9DL(this, contentFilterDictionaryImpl, list, list2, null, 3));
    }

    static {
        String[] strArr = {"1437630789907337", "963543174336669", "924699208319756", "833039450621886", "236826591337859", "167244268788346", "165545552280417"};
        C14360o3.A0B(strArr, 0);
        A0C = AbstractC009903n.A0K(strArr);
        String[] strArr2 = {"339923028011723", "1169998560477470", "1002053244036451", "698788968100868", "562506825074455", "1056956421907175", "692454682076002", "471787574744924"};
        C14360o3.A0B(strArr2, 0);
        A0F = AbstractC009903n.A0K(strArr2);
        String[] strArr3 = {"1095241914368736", "689777082261575", "410898304182133", "683161379620227", "687512819191184", "309520564628050", "368904968607613"};
        C14360o3.A0B(strArr3, 0);
        A0D = AbstractC009903n.A0K(strArr3);
        String[] strArr4 = {"1128833187722909", "830268895086754", "477809040910462", "1732998953765487"};
        C14360o3.A0B(strArr4, 0);
        A0E = AbstractC009903n.A0K(strArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C09530e4 A01(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl r22, java.lang.String r23, java.util.Set r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl.A01(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl, java.lang.String, java.util.Set, boolean):X.0e4");
    }

    @Override // X.InterfaceC2044192x
    public final Object DAB(ContentFilterDictionaryImpl contentFilterDictionaryImpl, InterfaceC23621Ds interfaceC23621Ds) {
        Object A00 = AbstractC23641Du.A00(interfaceC23621Ds, this.A0A, new C9DS(this, contentFilterDictionaryImpl, (InterfaceC23621Ds) null, 8));
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }

    @Override // X.InterfaceC2044192x
    public final Object DAD(ContentFilterDictionaryImpl contentFilterDictionaryImpl, InterfaceC23621Ds interfaceC23621Ds) {
        Object A00 = AbstractC23641Du.A00(interfaceC23621Ds, this.A0A, new C9D4(contentFilterDictionaryImpl, this, (InterfaceC23621Ds) null, 6));
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }

    @Override // X.InterfaceC2044192x
    public final Object DAH(ContentFilterDictionaryImpl contentFilterDictionaryImpl, InterfaceC23621Ds interfaceC23621Ds) {
        Object A00 = AbstractC23641Du.A00(interfaceC23621Ds, this.A0A, new C9D4(contentFilterDictionaryImpl, this, (InterfaceC23621Ds) null, 7));
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        ContentFilterDictionaryRegistrar contentFilterDictionaryRegistrar = this.A04;
        C19L c19l = contentFilterDictionaryRegistrar.A0F;
        C9DS c9ds = new C9DS(contentFilterDictionaryRegistrar, this, (InterfaceC23621Ds) null, 6);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A03(num, anonymousClass191, c9ds, c19l);
        AbstractC23641Du.A03(num, anonymousClass191, new C9DH(this, null, 45), this.A0B);
    }

    public ContentFilterEngineImpl(C12N c12n, UserSession userSession, C2044292z c2044292z, ContentFilterDictionaryRegistrar contentFilterDictionaryRegistrar) {
        this.A04 = contentFilterDictionaryRegistrar;
        this.A03 = c2044292z;
        this.A09 = c12n;
        this.A02 = userSession;
        C19L c19l = contentFilterDictionaryRegistrar.A0F;
        C9DS c9ds = new C9DS(contentFilterDictionaryRegistrar, this, (InterfaceC23621Ds) null, 4);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9ds, c19l);
        C14090nZ AOT = c12n.AOT(1182601864, 3);
        this.A0A = AOT;
        this.A0B = AnonymousClass194.A02(AOT);
        this.A07 = AbstractC09440dt.A01(new C9E1(this, 35));
        this.A06 = AbstractC09440dt.A01(new C9E1(this, 34));
        C14360o3.A0B(userSession, 0);
        this.A01 = (int) C18U.A01(C06090Tz.A06, userSession, 36597961790196813L);
        this.A05 = new LinkedHashMap();
        this.A08 = new AnonymousClass139();
        this.A00 = new AnonymousClass930(userSession);
    }
}
