package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchMetaAIResponse;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Fbm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35014Fbm {
    public final FRO A01(UserSession userSession, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo;
        DiscoverableThreadInfo discoverableThreadInfo;
        C14360o3.A0B(list, 7);
        FRO fro = new FRO();
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectSearchResult A0M = AbstractC31171DnF.A0M(it);
            if (A0M instanceof DirectShareTarget) {
                C14360o3.A0C(A0M, AbstractC43591JPw.A00(45));
                DirectShareTarget directShareTarget = (DirectShareTarget) A0M;
                if (z3 || !directShareTarget.A0P()) {
                    if (directShareTarget.A0S) {
                        arrayList = fro.A07;
                        arrayList.add(A0M);
                    } else {
                        Integer A04 = directShareTarget.A04(userSession.userId, z4);
                        C14360o3.A07(A04);
                        if (z) {
                            if (A04 != C05F.A01 && A04 != C05F.A0C) {
                                if (A04 == C05F.A0N) {
                                    arrayList2 = fro.A05;
                                }
                            } else {
                                arrayList2 = fro.A06;
                            }
                            arrayList2.add(directShareTarget);
                        }
                        if (directShareTarget.A01 == 1012) {
                            A1E2.add(directShareTarget);
                        } else {
                            if (A04 == C05F.A0B) {
                                arrayList2 = fro.A01;
                            } else {
                                if (directShareTarget.A0T() || directShareTarget.A0O()) {
                                    if (!z5 && ((creatorBroadcastThreadInfo = directShareTarget.A04) != null || directShareTarget.A05 != null || directShareTarget.A06 != null)) {
                                        if ((creatorBroadcastThreadInfo != null && creatorBroadcastThreadInfo.A07) || (((discoverableThreadInfo = directShareTarget.A06) != null && discoverableThreadInfo.A03) || directShareTarget.A05 != null)) {
                                            A1E.add(directShareTarget);
                                        } else {
                                            arrayList2 = fro.A02;
                                        }
                                    } else if (((!AbstractC121145e9.A00(str) || !C18U.A06(C06090Tz.A05, userSession, 36317496131523861L)) && (!AbstractC121145e9.A01(str) || !C18U.A06(C06090Tz.A05, userSession, 36317496132310297L))) || !directShareTarget.A0Y(userSession.userId)) {
                                        if (C4GR.A05(directShareTarget.A01) && directShareTarget.A0O != null) {
                                            arrayList2 = fro.A0B;
                                        } else {
                                            arrayList2 = fro.A0D;
                                        }
                                    }
                                }
                                if (A04 == C05F.A0Y) {
                                    arrayList2 = fro.A03;
                                } else {
                                    arrayList2 = fro.A04;
                                }
                            }
                            arrayList2.add(directShareTarget);
                        }
                    }
                }
            } else {
                if (!(A0M instanceof DirectMessageSearchMessage) && !(A0M instanceof DirectMessageSearchThread)) {
                    if (A0M instanceof DirectSearchResharedContent) {
                        arrayList = fro.A0C;
                    } else if (A0M instanceof DirectSearchMetaAIResponse) {
                        DirectSearchMetaAIResponse directSearchMetaAIResponse = (DirectSearchMetaAIResponse) A0M;
                        EnumC53305Nhh enumC53305Nhh = directSearchMetaAIResponse.A00;
                        C14360o3.A0B(enumC53305Nhh, 0);
                        fro.A00 = enumC53305Nhh;
                        fro.A09.addAll(directSearchMetaAIResponse.A01);
                    } else if (A0M instanceof DirectSearchPrompt) {
                        arrayList = fro.A09;
                    }
                } else {
                    arrayList = fro.A08;
                }
                arrayList.add(A0M);
            }
        }
        if (z2) {
            ArrayList arrayList3 = fro.A0D;
            ArrayList arrayList4 = fro.A06;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        }
        ArrayList arrayList5 = fro.A0D;
        arrayList5.addAll(A1E);
        arrayList5.addAll(0, A1E2);
        return fro;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8, 36317496131523861L) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8, 36317496132310297L) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(com.instagram.common.session.UserSession r8, X.FRO r9, java.lang.String r10, java.util.List r11, java.util.List r12) {
        /*
            r7 = this;
            r4 = 0
            X.C14360o3.A0B(r8, r4)
            boolean r3 = X.AbstractC31175DnJ.A1a(r9)
            java.util.Iterator r6 = r11.iterator()
        Lc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Laf
            com.instagram.model.direct.DirectSearchResult r2 = X.AbstractC31171DnF.A0M(r6)
            boolean r0 = r2 instanceof com.instagram.model.direct.DirectShareTarget
            if (r0 == 0) goto La3
            r0 = 45
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.C14360o3.A0C(r2, r0)
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            boolean r0 = r2.A0P()
            if (r0 != 0) goto Lc
            boolean r0 = r2.A0S
            if (r0 != 0) goto Lc
            boolean r0 = r2.A0L()
            if (r0 == 0) goto L74
            boolean r0 = r2.A0T()
            if (r0 == 0) goto L69
            if (r12 != 0) goto L69
            boolean r0 = X.AbstractC121145e9.A00(r10)
            if (r0 == 0) goto L50
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36317496131523861(0x810692000d1515, double:3.0306690201701116E-306)
            boolean r0 = X.C18U.A06(r5, r8, r0)
            if (r0 != 0) goto L63
        L50:
            boolean r0 = X.AbstractC121145e9.A01(r10)
            if (r0 == 0) goto La0
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36317496132310297(0x81069200191519, double:3.030669020667457E-306)
            boolean r0 = X.C18U.A06(r5, r8, r0)
            if (r0 == 0) goto La0
        L63:
            java.util.ArrayList r1 = r9.A03
        L65:
            r1.add(r2)
            goto Lc
        L69:
            java.lang.String r0 = r8.userId
            java.lang.Integer r1 = r2.A04(r0, r4)
            java.lang.Integer r0 = X.C05F.A0Y
            if (r1 != r0) goto Lc
            goto L63
        L74:
            if (r12 == 0) goto L8d
            java.lang.String r0 = r2.A09()
            boolean r0 = r12.contains(r0)
            if (r0 != 0) goto L8a
            java.lang.String r0 = r2.A08()
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L8d
        L8a:
            java.util.ArrayList r1 = r9.A0A
            goto L65
        L8d:
            boolean r0 = X.AbstractC121145e9.A01(r10)
            if (r0 == 0) goto La0
            java.lang.Integer r0 = r2.A0E
            if (r0 == 0) goto La0
            int r0 = r0.intValue()
            if (r0 != r3) goto La0
            java.util.ArrayList r1 = r9.A02
            goto L65
        La0:
            java.util.ArrayList r1 = r9.A0D
            goto L65
        La3:
            boolean r0 = r2 instanceof com.instagram.model.direct.DirectSearchResharedContent
            if (r0 == 0) goto Lc
            java.util.ArrayList r1 = r9.A0C
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.model.direct.DirectSearchResharedContent"
            X.C14360o3.A0C(r2, r0)
            goto L65
        Laf:
            java.util.ArrayList r0 = r9.A0C
            A00(r0)
            java.util.ArrayList r0 = r9.A0D
            A00(r0)
            java.util.ArrayList r0 = r9.A08
            A00(r0)
            java.util.ArrayList r0 = r9.A03
            A00(r0)
            java.util.ArrayList r0 = r9.A02
            A00(r0)
            java.util.ArrayList r0 = r9.A06
            A00(r0)
            java.util.ArrayList r0 = r9.A04
            A00(r0)
            java.util.ArrayList r0 = r9.A05
            A00(r0)
            java.util.ArrayList r0 = r9.A0A
            A00(r0)
            java.util.ArrayList r0 = r9.A0B
            A00(r0)
            java.util.ArrayList r0 = r9.A01
            A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35014Fbm.A02(com.instagram.common.session.UserSession, X.FRO, java.lang.String, java.util.List, java.util.List):void");
    }

    public static final void A00(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(linkedHashSet);
    }
}
