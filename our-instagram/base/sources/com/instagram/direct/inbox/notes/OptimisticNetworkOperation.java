package com.instagram.direct.inbox.notes;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25233BEq;
import X.AbstractC25651Mw;
import X.AbstractC43592JPx;
import X.AbstractC43593JPy;
import X.AbstractC43594JPz;
import X.AnonymousClass016;
import X.C05A;
import X.C05F;
import X.C0CA;
import X.C14360o3;
import X.C2JM;
import X.C36083FwJ;
import X.C45052Jwh;
import X.C45103JxX;
import X.C45821KQa;
import X.C45822KQb;
import X.C45823KQc;
import X.C45824KQd;
import X.C45825KQe;
import X.C50359MLl;
import X.C59467QfB;
import X.C6C9;
import X.InterfaceC23621Ds;
import X.InterfaceC40501uJ;
import X.InterfaceC41501vz;
import X.KQY;
import X.KQZ;
import X.QfI;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class OptimisticNetworkOperation {
    public boolean A00;
    public final NotesApi A01;

    /* JADX WARN: Multi-variable type inference failed */
    public Object A02(NotesApi notesApi, List list, InterfaceC23621Ds interfaceC23621Ds) {
        PandoRealtimeInfoJNI pandoRealtimeInfoJNI;
        InterfaceC40501uJ A0H;
        Map paramsCopy;
        Map paramsCopy2;
        Class cls;
        ArrayList A1E;
        String str;
        boolean z;
        int i;
        String str2;
        if (this instanceof C45822KQb) {
            C45822KQb c45822KQb = (C45822KQb) this;
            return notesApi.A01(null, null, c45822KQb.A04, null, null, null, null, null, null, interfaceC23621Ds, c45822KQb.A02);
        }
        if (this instanceof C45824KQd) {
            C45824KQd c45824KQd = (C45824KQd) this;
            return notesApi.A00(null, null, c45824KQd.A03, null, null, null, null, null, null, interfaceC23621Ds, c45824KQd.A02);
        }
        if (this instanceof KQZ) {
            return notesApi.A02(null, null, null, null, null, null, null, null, interfaceC23621Ds, ((KQZ) this).A02);
        }
        if (this instanceof KQY) {
            return notesApi.A03(null, null, null, null, null, null, null, null, interfaceC23621Ds, ((KQY) this).A02);
        }
        if (this instanceof C45825KQe) {
            return notesApi.A04(String.valueOf(((C45825KQe) this).A03), interfaceC23621Ds);
        }
        if (this instanceof C45823KQc) {
            long j = ((C45823KQc) this).A02;
            pandoRealtimeInfoJNI = null;
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            A0H = AbstractC25233BEq.A0H(AbstractC25227BEk.A0T(GraphQlCallInput.A02, String.valueOf(j), "note_id"), A0b, "request");
            paramsCopy = A0b.getParamsCopy();
            paramsCopy2 = A0b2.getParamsCopy();
            cls = QfI.class;
            A1E = AbstractC166987dD.A1E();
            str = "DeclineCollabNoteInvite";
            z = true;
            i = 0;
            str2 = "xdt_decline_collab_note_invite";
        } else {
            C45821KQa c45821KQa = (C45821KQa) this;
            long j2 = c45821KQa.A02;
            int i2 = c45821KQa.A01;
            pandoRealtimeInfoJNI = null;
            C2JM A0b3 = AbstractC25225BEi.A0b();
            C2JM A0b4 = AbstractC25225BEi.A0b();
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, String.valueOf(j2), "note_id");
            C0CA.A00(A0T, AbstractC43592JPx.A0r(i2), "audience");
            A0H = AbstractC25233BEq.A0H(A0T, A0b3, "request");
            paramsCopy = A0b3.getParamsCopy();
            paramsCopy2 = A0b4.getParamsCopy();
            cls = C59467QfB.class;
            A1E = AbstractC166987dD.A1E();
            str = "AcceptCollabNoteInvite";
            z = true;
            i = 0;
            str2 = "xdt_accept_collab_note_invite";
        }
        return notesApi.A00.A04(new PandoGraphQLRequest(A0H, str, paramsCopy, paramsCopy2, cls, z, pandoRealtimeInfoJNI, i, pandoRealtimeInfoJNI, str2, A1E), interfaceC23621Ds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06ac  */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.05A] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r78) {
        /*
            Method dump skipped, instructions count: 1763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.OptimisticNetworkOperation.A03(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.InterfaceC23621Ds r14) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C45822KQb
            if (r0 != 0) goto L91
            boolean r0 = r13 instanceof X.C45824KQd
            if (r0 != 0) goto L91
            boolean r0 = r13 instanceof X.KQZ
            if (r0 != 0) goto L91
            boolean r0 = r13 instanceof com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation
            if (r0 == 0) goto L8f
            r10 = r13
            com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation r10 = (com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation) r10
            r3 = 21
            boolean r0 = X.MAT.A03(r14, r3)
            if (r0 == 0) goto L85
            r5 = r14
            X.MAT r5 = (X.MAT) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r5.A00 = r2
        L29:
            java.lang.Object r1 = r5.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L3e
            if (r0 != r4) goto L8a
            X.AbstractC09560e7.A00(r1)
        L37:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r6 = X.AbstractC001800i.A0X(r1)
            return r6
        L3e:
            X.AbstractC09560e7.A00(r1)
            java.util.List r7 = r10.A0E
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L4c
            X.0sl r6 = X.C16930sl.A00
            return r6
        L4c:
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            X.1tg r2 = X.C40121td.A0G
            android.content.Context r1 = r10.A03
            com.instagram.common.session.UserSession r0 = r10.A05
            X.1td r8 = r2.A01(r1, r0)
            java.util.Iterator r2 = r7.iterator()
        L5e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r9 = r2.next()
            X.19L r1 = r10.A0F
            r11 = 0
            r12 = 33
            X.MCI r7 = new X.MCI
            r7.<init>(r8, r9, r10, r11, r12)
            X.191 r0 = X.AnonymousClass191.A00
            X.2Sa r0 = X.AbstractC23641Du.A02(r0, r7, r1)
            r3.add(r0)
            goto L5e
        L7c:
            r5.A00 = r4
            java.lang.Object r1 = X.AbstractC918549n.A00(r3, r5)
            if (r1 != r6) goto L37
            return r6
        L85:
            X.MAT r5 = X.MAT.A00(r10, r14, r3)
            goto L29
        L8a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L8f:
            boolean r0 = r13 instanceof X.KQY
        L91:
            X.0sl r0 = X.C16930sl.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.OptimisticNetworkOperation.A04(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ee, code lost:
    
        if (r4 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01e9, code lost:
    
        if (r4 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0080, code lost:
    
        if (r8 == r7) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c9 A[LOOP:2: B:132:0x02c3->B:134:0x02c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.InterfaceC23621Ds r31) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.OptimisticNetworkOperation.A05(X.1Ds):java.lang.Object");
    }

    public final void A06() {
        NotesRepository notesRepository;
        String str;
        C6C9 c6c9;
        NotesRepository notesRepository2;
        C6C9 c6c92;
        int i;
        String str2;
        String str3;
        List list;
        ArrayList arrayList;
        C45052Jwh c45052Jwh;
        List list2;
        if (this instanceof C45824KQd) {
            C45824KQd c45824KQd = (C45824KQd) this;
            notesRepository2 = c45824KQd.A06;
            c6c92 = c45824KQd.A01;
            i = c45824KQd.A00;
            str2 = c45824KQd.A04;
        } else {
            if (this instanceof KQZ) {
                KQZ kqz = (KQZ) this;
                notesRepository2 = kqz.A05;
                c6c92 = kqz.A01;
                i = kqz.A00;
            } else {
                if (this instanceof GraphqlOptimisticPostOperation) {
                    GraphqlOptimisticPostOperation graphqlOptimisticPostOperation = (GraphqlOptimisticPostOperation) this;
                    String str4 = graphqlOptimisticPostOperation.A0B;
                    if (str4 != null) {
                        NotesRepository notesRepository3 = graphqlOptimisticPostOperation.A06;
                        C6C9 c6c93 = graphqlOptimisticPostOperation.A01;
                        synchronized (notesRepository3) {
                            C05A c05a = notesRepository3.A0X;
                            ArrayList A00 = A00(c05a);
                            C05A c05a2 = notesRepository3.A0Z;
                            LinkedHashMap A13 = AbstractC43593JPy.A13(c05a2);
                            C45052Jwh A0W = AbstractC43594JPz.A0W(str4, c05a2);
                            if (A0W != null && (list2 = A0W.A05) != null) {
                                arrayList = AbstractC166987dD.A1F(list2);
                                if (arrayList != null) {
                                    AnonymousClass016.A1A(arrayList, new C50359MLl(notesRepository3, 48));
                                }
                            } else {
                                arrayList = null;
                            }
                            if (AbstractC43592JPx.A1a("1_", 1, str4)) {
                                A01(str4, A00, notesRepository3.A0I);
                                A13.remove(str4);
                            } else {
                                if (arrayList != null && (c45052Jwh = (C45052Jwh) A13.get(str4)) != null) {
                                    if (c6c93 != null) {
                                        arrayList.add(c6c93);
                                    }
                                    String str5 = c45052Jwh.A03;
                                    String str6 = c45052Jwh.A04;
                                    User user = c45052Jwh.A00;
                                    String str7 = c45052Jwh.A02;
                                    String str8 = c45052Jwh.A01;
                                    C14360o3.A0B(str5, 0);
                                    C14360o3.A0B(str6, 1);
                                    A13.put(str4, new C45052Jwh(user, str5, str6, str7, str8, arrayList));
                                }
                                notesRepository3.A0S(str4, A00, true, AbstractC167007dF.A1W(c6c93), true);
                            }
                            c05a2.Egh(A13);
                            c05a.Egh(A00);
                        }
                    } else {
                        C45103JxX c45103JxX = graphqlOptimisticPostOperation.A04;
                        if (c45103JxX != null) {
                            graphqlOptimisticPostOperation.A06.A0H(c45103JxX, graphqlOptimisticPostOperation.A00, C05F.A01);
                        } else {
                            int i2 = graphqlOptimisticPostOperation.A09.A00;
                            int i3 = NoteStyle.A0B.A00;
                            NotesRepository notesRepository4 = graphqlOptimisticPostOperation.A06;
                            C6C9 c6c94 = graphqlOptimisticPostOperation.A00;
                            if (i2 == i3) {
                                notesRepository4.A0J(c6c94, C05F.A01);
                            } else {
                                notesRepository4.A0I(c6c94);
                            }
                        }
                    }
                    List list3 = graphqlOptimisticPostOperation.A0D;
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        AbstractC25651Mw.A00(graphqlOptimisticPostOperation.A05).A02((InterfaceC41501vz) it.next(), C36083FwJ.class);
                    }
                    list3.clear();
                    return;
                }
                if (this instanceof KQY) {
                    KQY kqy = (KQY) this;
                    notesRepository2 = kqy.A03;
                    c6c92 = kqy.A01;
                    i = kqy.A00;
                } else {
                    if (this instanceof C45825KQe) {
                        C45825KQe c45825KQe = (C45825KQe) this;
                        NotesRepository notesRepository5 = c45825KQe.A05;
                        synchronized (notesRepository5) {
                            C6C9 c6c95 = c45825KQe.A01;
                            if (c6c95 != null) {
                                int i4 = c45825KQe.A00;
                                if (c6c95.A01 == NoteStyle.A0B.A00) {
                                    notesRepository5.A0I.put(c6c95.A0H, c6c95);
                                } else {
                                    notesRepository5.A0I.put(c6c95.A0K, c6c95);
                                }
                                C05A c05a3 = notesRepository5.A0X;
                                ArrayList A002 = A00(c05a3);
                                int size = A002.size();
                                if (i4 > size) {
                                    i4 = size;
                                }
                                A002.add(i4, c6c95);
                                c05a3.Egh(A002);
                            }
                            C6C9 c6c96 = c45825KQe.A02;
                            if (c6c96 != null && (str3 = c45825KQe.A06) != null) {
                                C05A c05a4 = notesRepository5.A0Z;
                                LinkedHashMap A132 = AbstractC43593JPy.A13(c05a4);
                                C45052Jwh c45052Jwh2 = (C45052Jwh) A132.get(str3);
                                if (c45052Jwh2 != null && (list = c45052Jwh2.A05) != null) {
                                    ArrayList A1F = AbstractC166987dD.A1F(list);
                                    A1F.add(c6c96);
                                    C45052Jwh c45052Jwh3 = (C45052Jwh) A132.get(str3);
                                    if (c45052Jwh3 != null) {
                                        String str9 = c45052Jwh3.A03;
                                        String str10 = c45052Jwh3.A04;
                                        User user2 = c45052Jwh3.A00;
                                        String str11 = c45052Jwh3.A02;
                                        String str12 = c45052Jwh3.A01;
                                        C14360o3.A0B(str9, 0);
                                        C14360o3.A0B(str10, 1);
                                        A132.put(str3, new C45052Jwh(user2, str9, str10, str11, str12, A1F));
                                    }
                                }
                                c05a4.Egh(A132);
                                C05A c05a5 = notesRepository5.A0X;
                                ArrayList A003 = A00(c05a5);
                                notesRepository5.A0S(str3, A003, false, true, true);
                                c05a5.Egh(A003);
                            }
                        }
                        return;
                    }
                    if (this instanceof C45823KQc) {
                        C45823KQc c45823KQc = (C45823KQc) this;
                        notesRepository = c45823KQc.A03;
                        str = c45823KQc.A04;
                        c6c9 = c45823KQc.A00;
                    } else if (this instanceof C45822KQb) {
                        C45822KQb c45822KQb = (C45822KQb) this;
                        notesRepository2 = c45822KQb.A03;
                        c6c92 = c45822KQb.A01;
                        i = c45822KQb.A00;
                        str2 = c45822KQb.A05;
                    } else {
                        C45821KQa c45821KQa = (C45821KQa) this;
                        notesRepository = c45821KQa.A03;
                        str = c45821KQa.A04;
                        c6c9 = c45821KQa.A00;
                    }
                    notesRepository.A0K(c6c9, str);
                    return;
                }
            }
            str2 = null;
        }
        notesRepository2.A0L(c6c92, str2, i);
    }

    public OptimisticNetworkOperation(NotesApi notesApi) {
        this.A01 = notesApi;
    }

    public static ArrayList A00(C05A c05a) {
        return AbstractC001800i.A0U((Collection) c05a.getValue());
    }

    public static void A01(Object obj, AbstractCollection abstractCollection, AbstractMap abstractMap) {
        C6C9 c6c9 = (C6C9) abstractMap.remove(obj);
        if (c6c9 != null) {
            abstractCollection.remove(c6c9);
        }
    }
}
