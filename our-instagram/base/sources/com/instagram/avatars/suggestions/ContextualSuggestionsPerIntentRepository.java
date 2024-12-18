package com.instagram.avatars.suggestions;

import X.AbstractC001800i;
import X.AbstractC06950Ym;
import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC208910l;
import X.AbstractC25226BEj;
import X.AbstractC25228BEl;
import X.AbstractC31177DnL;
import X.AbstractC439521d;
import X.AbstractC47104Krz;
import X.AbstractC58317Pt9;
import X.C006802i;
import X.C008002u;
import X.C05F;
import X.C09530e4;
import X.C10E;
import X.C125545m0;
import X.C126475ni;
import X.C13920nI;
import X.C14360o3;
import X.C148286ly;
import X.C23671Dx;
import X.C25547BRj;
import X.C2JS;
import X.C45050Jwf;
import X.C4A7;
import X.C4OF;
import X.EnumC143276dS;
import X.EnumC143286dT;
import X.EnumC46238KdE;
import X.InterfaceC19390xP;
import X.L8X;
import X.L9X;
import X.MBq;
import X.MCP;
import X.MRB;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.avatars.suggestions.graphql.RankedStickerImpl;
import com.instagram.avatars.suggestions.interactor.IGContextualSuggestionsAPI;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class ContextualSuggestionsPerIntentRepository extends C4A7 implements MRB {
    public long A00;
    public AbstractC439521d A01;
    public final EnumC143276dS A02;
    public final EnumC143286dT A03;
    public final AvatarStore A04;
    public final L8X A05;
    public final L8X A06;
    public final IGContextualSuggestionsAPI A07;
    public final C006802i A08;
    public final UserSession A09;
    public final C13920nI A0A;
    public final Integer A0B;
    public final ConcurrentHashMap A0C;
    public final AtomicBoolean A0D;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ContextualSuggestionsPerIntentRepository(X.EnumC143276dS r10, X.EnumC143286dT r11, X.C006802i r12, com.instagram.common.session.UserSession r13) {
        /*
            r9 = this;
            r0 = 2
            int r6 = X.AbstractC25230BEn.A07(r0, r12, r10)
            com.instagram.avatars.store.AvatarStore r5 = X.C20Y.A00(r13)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.HOURS
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36603515183764419(0x820ab4000f13c3, double:3.211548620513321E-306)
            long r0 = X.C18U.A01(r2, r13, r0)
            long r0 = r3.toMillis(r0)
            com.instagram.avatars.suggestions.interactor.IGContextualSuggestionsAPI r7 = new com.instagram.avatars.suggestions.interactor.IGContextualSuggestionsAPI
            r7.<init>(r13, r0)
            X.0nI r8 = X.C13920nI.A00
            r0 = 5
            X.AbstractC167007dF.A1H(r5, r0, r8)
            r3 = 0
            r4 = 0
            r0 = 1342004349(0x4ffd5c7d, float:8.501394E9)
            X.19K r1 = X.C4A8.A01(r0, r6)
            java.lang.String r0 = "ContextualSuggestionsStickersRepository"
            r9.<init>(r0, r1)
            r9.A09 = r13
            r9.A08 = r12
            r9.A02 = r10
            r9.A03 = r11
            r9.A04 = r5
            r9.A07 = r7
            r9.A0A = r8
            X.L8X r0 = new X.L8X
            r0.<init>()
            r9.A06 = r0
            X.L8X r0 = new X.L8X
            r0.<init>()
            r9.A05 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r9.A0C = r0
            r0 = 36603515183698882(0x820ab4000e13c2, double:3.2115486204718753E-306)
            int r1 = X.AbstractC25225BEi.A07(r2, r13, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L7c
            if (r1 != 0) goto L7c
        L67:
            r9.A0B = r4
            X.21c r0 = X.C439421c.A00
            r9.A01 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r3)
            r9.A0D = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9.A00 = r0
            return
        L7c:
            r4 = r0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository.<init>(X.6dS, X.6dT, X.02i, com.instagram.common.session.UserSession):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r12, java.util.List r13, X.InterfaceC23621Ds r14, boolean r15) {
        /*
            r8 = 2
            boolean r0 = X.PX0.A01(r14, r8)
            if (r0 == 0) goto L83
            r7 = r14
            X.PX0 r7 = (X.PX0) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r7.A00 = r2
        L15:
            java.lang.Object r9 = r7.A03
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 == r4) goto L42
            if (r0 != r8) goto L89
            java.lang.Object r12 = r7.A01
            com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r12 = (com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository) r12
            X.AbstractC09560e7.A00(r9)
        L2a:
            X.Jwf r9 = (X.C45050Jwf) r9
            if (r9 != 0) goto L8e
            return r5
        L2f:
            X.AbstractC09560e7.A00(r9)
            r0 = 0
            r7.A01 = r12
            r7.A02 = r13
            r7.A05 = r15
            r7.A00 = r4
            java.lang.Object r9 = A03(r12, r13, r7, r15, r0)
            if (r9 != r6) goto L4f
            return r6
        L42:
            boolean r15 = r7.A05
            java.lang.Object r13 = r7.A02
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r12 = r7.A01
            com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r12 = (com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository) r12
            X.AbstractC09560e7.A00(r9)
        L4f:
            X.Jwf r9 = (X.C45050Jwf) r9
            if (r9 != 0) goto L54
            return r5
        L54:
            long r2 = A00(r9)
            long r10 = X.AbstractC31177DnL.A06()
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 > 0) goto L92
            if (r13 == 0) goto L76
            java.util.Iterator r2 = r13.iterator()
        L66:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r1 = r2.next()
            java.util.concurrent.ConcurrentHashMap r0 = r12.A0C
            r0.remove(r1)
            goto L66
        L76:
            r7.A01 = r12
            r7.A02 = r5
            r7.A00 = r8
            java.lang.Object r9 = A03(r12, r13, r7, r15, r4)
            if (r9 != r6) goto L2a
            return r6
        L83:
            X.PX0 r7 = new X.PX0
            r7.<init>(r12, r14, r8)
            goto L15
        L89:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L8e:
            long r2 = A00(r9)
        L92:
            long r0 = r12.A00
            long r0 = java.lang.Math.min(r2, r0)
            r12.A00 = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository.A02(com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository, java.util.List, X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.MRB
    public final List Aji(List list) {
        C14360o3.A0B(list, 0);
        C09530e4 A04 = A04(list);
        String str = (String) A04.A00;
        List list2 = (List) A04.A01;
        List A00 = this.A05.A00(list2, str);
        if (!AbstractC166987dD.A1b(A00)) {
            return this.A06.A00(list2, str);
        }
        return A00;
    }

    @Override // X.MRB
    public final InterfaceC19390xP F8n(List list) {
        C14360o3.A0B(list, 0);
        List list2 = (List) A04(list).A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list2) {
            AbstractC25228BEl.A1Q(obj, A1E, this.A0C.containsKey(obj) ? 1 : 0);
        }
        if (AbstractC001800i.A0t(A1E)) {
            C008002u A00 = C10E.A00(Aji(list));
            AbstractC166987dD.A1Z(new MCP(A00, list, this, A1E, null, 18), super.A01);
            return AbstractC208910l.A02(A00);
        }
        return null;
    }

    public static final long A00(C45050Jwf c45050Jwf) {
        long j;
        long j2;
        Iterator it = AbstractC001800i.A0S(AbstractC06950Ym.A1F(c45050Jwf.A03.values()), AbstractC06950Ym.A1F(c45050Jwf.A02.values())).iterator();
        if (!it.hasNext()) {
            return Long.MAX_VALUE;
        }
        ImageUrl imageUrl = ((C148286ly) ((C25547BRj) it.next()).A01).A0H;
        C14360o3.A07(imageUrl);
        Long A00 = AbstractC47104Krz.A00(imageUrl);
        if (A00 != null) {
            j = A00.longValue();
        } else {
            j = Long.MAX_VALUE;
        }
        Long valueOf = Long.valueOf(j);
        while (it.hasNext()) {
            ImageUrl imageUrl2 = ((C148286ly) ((C25547BRj) it.next()).A01).A0H;
            C14360o3.A07(imageUrl2);
            Long A002 = AbstractC47104Krz.A00(imageUrl2);
            if (A002 != null) {
                j2 = A002.longValue();
            } else {
                j2 = Long.MAX_VALUE;
            }
            Long valueOf2 = Long.valueOf(j2);
            if (valueOf.compareTo(valueOf2) > 0) {
                valueOf = valueOf2;
            }
        }
        if (valueOf == null) {
            return Long.MAX_VALUE;
        }
        return valueOf.longValue();
    }

    public static final C25547BRj A01(RankedStickerImpl rankedStickerImpl) {
        C2JS optionalTreeField;
        String A07;
        String A08;
        String str;
        C4OF c4of = C2JS.Companion;
        C2JS reinterpretIfFulfillsType = rankedStickerImpl.reinterpretIfFulfillsType(0, "XIGRankedAvatarSticker", RankedStickerImpl.InlineXIGRankedAvatarSticker.class, 1297693564);
        if (reinterpretIfFulfillsType == null || (optionalTreeField = reinterpretIfFulfillsType.getOptionalTreeField(0, "sticker", RankedStickerImpl.InlineXIGRankedAvatarSticker.Sticker.class, 1928639229)) == null || (A07 = optionalTreeField.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) == null || (A08 = optionalTreeField.A08("cdn_url")) == null) {
            return null;
        }
        int coercedIntField = optionalTreeField.getCoercedIntField(5, IgReactMediaPickerNativeModule.WIDTH);
        int coercedIntField2 = optionalTreeField.getCoercedIntField(6, IgReactMediaPickerNativeModule.HEIGHT);
        String A0D = optionalTreeField.A0D("accessibility_label");
        Enum optionalEnumField = optionalTreeField.getOptionalEnumField(9, "media_type", EnumC46238KdE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        int coercedIntField3 = optionalTreeField.getCoercedIntField(10, AbstractC58317Pt9.A00(323));
        String A0B = optionalTreeField.A0B(AbstractC111324zv.A00(122));
        ImmutableList requiredCompactedStringListField = optionalTreeField.getRequiredCompactedStringListField(11, "tags");
        String A09 = optionalTreeField.A09("template");
        float coercedDoubleField = (float) reinterpretIfFulfillsType.getCoercedDoubleField(1, "weight");
        C148286ly A00 = C148286ly.A00(new SimpleImageUrl(A08, coercedIntField, coercedIntField2), A07, "avatar_sticker", coercedIntField, coercedIntField2, 1.0f);
        A00.A0M = A0D;
        A00.A0C = coercedIntField3;
        if (optionalEnumField == EnumC46238KdE.CLIP) {
            str = "animation";
        } else {
            str = "image";
        }
        A00.A0h = str;
        if (A0B != null) {
            A00.A0a = A0B;
        }
        if (A09 != null) {
            A00.A0b = A09;
        }
        A00.A0j = requiredCompactedStringListField;
        return new C25547BRj(A00, coercedDoubleField, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.Jwf] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r16, java.util.List r17, X.InterfaceC23621Ds r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository.A03(com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository, java.util.List, X.1Ds, boolean, boolean):java.lang.Object");
    }

    @Override // X.MRB
    public final boolean BBA() {
        if (!this.A06.A01() && !this.A05.A01()) {
            return false;
        }
        return true;
    }

    @Override // X.MRB
    public final boolean CLq() {
        if (this.A00 <= AbstractC31177DnL.A06()) {
            return false;
        }
        AbstractC439521d abstractC439521d = this.A04.A01;
        if (C14360o3.A0K(abstractC439521d, C125545m0.A00)) {
            if ((this.A01 instanceof C126475ni) && BBA()) {
                return false;
            }
            return true;
        }
        return C14360o3.A0K(this.A01, abstractC439521d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f6, code lost:
    
        if (r1 == null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.MRB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E5J(X.InterfaceC23621Ds r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository.E5J(X.1Ds):java.lang.Object");
    }

    @Override // X.MRB
    public final C23671Dx ECr() {
        if (!this.A0D.compareAndSet(false, true)) {
            return null;
        }
        return AbstractC25226BEj.A1L(new MBq(this, null, 26), super.A01);
    }

    public static final C09530e4 A04(List list) {
        Object obj;
        String str;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj2 : list) {
            if (((L9X) obj2).A00 == C05F.A15) {
                A1E.add(obj2);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            A0q.add(((L9X) it.next()).A01);
        }
        Iterator it2 = list.iterator();
        do {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            obj = it2.next();
        } while (((L9X) obj).A00 != C05F.A1F);
        L9X l9x = (L9X) obj;
        if (l9x != null) {
            str = l9x.A01;
        } else {
            str = "";
        }
        return AbstractC166987dD.A1L(str, A0q);
    }
}
