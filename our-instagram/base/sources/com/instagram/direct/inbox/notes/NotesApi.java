package com.instagram.direct.inbox.notes;

import X.AbstractC40511uK;
import X.C04060Jx;
import X.C0CA;
import X.C14360o3;
import X.C18C;
import X.C25621Ms;
import X.C2JM;
import X.C2JQ;
import X.C38854H9c;
import X.C40701ud;
import X.C40781ul;
import X.C41263IOe;
import X.C55702hA;
import X.C59469QfG;
import X.InterfaceC23621Ds;
import X.QfK;
import X.QfM;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class NotesApi {
    public final C40701ud A00;
    public final UserSession A01;

    public NotesApi(UserSession userSession, C40701ud c40701ud) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c40701ud, 2);
        this.A01 = userSession;
        this.A00 = c40701ud;
    }

    public final Object A01(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC23621Ds interfaceC23621Ds, long j) {
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        String valueOf = String.valueOf(j);
        C0CA A02 = c04060Jx.A02();
        C0CA.A00(A02, valueOf, "note_id");
        C0CA.A00(A02, str, "emoji");
        C0CA.A00(A02, str2, "event_source");
        C0CA.A00(A02, str3, "container_module");
        C0CA.A00(A02, str4, "nav_chain");
        C0CA.A00(A02, str5, "inventory_source");
        C0CA.A00(A02, str6, "ranking_info_token");
        C0CA.A00(A02, num, "media_client_position");
        C0CA.A00(A02, str7, "carousel_media_id");
        C0CA.A00(A02, num2, "carousel_index");
        c2jm.A00.A02().A0E(A02, "request");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return this.A00.A04(new PandoGraphQLRequest(AbstractC40511uK.A00(), "CreateInboxTrayReactionRequest", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59469QfG.class, true, null, 0, null, "xdt_create_inbox_tray_reaction", new ArrayList()), interfaceC23621Ds);
    }

    public final Object A03(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, InterfaceC23621Ds interfaceC23621Ds, long j) {
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        String valueOf = String.valueOf(j);
        C0CA A02 = c04060Jx.A02();
        C0CA.A00(A02, valueOf, "note_id");
        C0CA.A00(A02, str, "event_source");
        C0CA.A00(A02, str2, "container_module");
        C0CA.A00(A02, str3, "nav_chain");
        C0CA.A00(A02, str4, "inventory_source");
        C0CA.A00(A02, str5, "ranking_info_token");
        C0CA.A00(A02, num, "media_client_position");
        C0CA.A00(A02, str6, "carousel_media_id");
        C0CA.A00(A02, num2, "carousel_index");
        c2jm.A00.A02().A0E(A02, "request");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return this.A00.A04(new PandoGraphQLRequest(AbstractC40511uK.A00(), "DeleteInboxTrayReactionRequest", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), QfM.class, true, null, 0, null, "xdt_delete_inbox_tray_reaction", new ArrayList()), interfaceC23621Ds);
    }

    public final Object A04(String str, InterfaceC23621Ds interfaceC23621Ds) {
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A04("item_id", str);
        boolean z = false;
        if (str != null) {
            z = true;
        }
        C18C.A0E(z);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return this.A00.A04(new PandoGraphQLRequest(AbstractC40511uK.A00(), "DeleteInboxTrayItemRequest", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), QfK.class, true, null, 0, null, "xdt_delete_inbox_tray_item", new ArrayList()), interfaceC23621Ds);
    }

    public final Object A00(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC23621Ds interfaceC23621Ds, long j) {
        C25621Ms c25621Ms = new C25621Ms(this.A01, -2);
        c25621Ms.A05();
        c25621Ms.A0B("notes/create_emoji_reaction/");
        c25621Ms.A0E("note_id", j);
        c25621Ms.A9s("emoji", str);
        c25621Ms.A0H("event_source", str2);
        c25621Ms.A0H("container_module", str3);
        c25621Ms.A0H("nav_chain", str4);
        c25621Ms.A0H("inventory_source", str5);
        c25621Ms.A0H("ranking_info_token", str6);
        c25621Ms.A0A(num, "media_client_position");
        c25621Ms.A0H("carousel_media_id", str7);
        c25621Ms.A0A(num2, "carousel_index");
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        return c25621Ms.A0N().A00(154543310, interfaceC23621Ds);
    }

    public final Object A02(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, InterfaceC23621Ds interfaceC23621Ds, long j) {
        C25621Ms c25621Ms = new C25621Ms(this.A01, -2);
        c25621Ms.A05();
        c25621Ms.A0B("notes/delete_emoji_reaction/");
        c25621Ms.A0E("note_id", j);
        c25621Ms.A0H("event_source", str);
        c25621Ms.A0H("container_module", str2);
        c25621Ms.A0H("nav_chain", str3);
        c25621Ms.A0H("inventory_source", str4);
        c25621Ms.A0H("ranking_info_token", str5);
        c25621Ms.A0A(num, "media_client_position");
        c25621Ms.A0H("carousel_media_id", str6);
        c25621Ms.A0A(num2, "carousel_index");
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        return c25621Ms.A0N().A00(24904279, interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.String r16, X.InterfaceC23621Ds r17) {
        /*
            r15 = this;
            r4 = 22
            r5 = r17
            boolean r0 = X.MAT.A03(r5, r4)
            if (r0 == 0) goto La8
            r1 = r5
            X.MAT r1 = (X.MAT) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto La8
            int r3 = r3 - r2
            r1.A00 = r3
        L18:
            java.lang.Object r3 = r1.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r1.A00
            r9 = 1
            if (r0 == 0) goto L53
            if (r0 != r9) goto Lb7
            X.AbstractC09560e7.A00(r3)
        L26:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L49
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            X.3NX r3 = new X.3NX
            r3.<init>(r0)
        L39:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 != 0) goto L48
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto Lb1
            X.0eB r0 = X.C0eB.A00
            X.8jk r3 = new X.8jk
            r3.<init>(r0)
        L48:
            return r3
        L49:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L39
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L53:
            X.AbstractC09560e7.A00(r3)
            r10 = 0
            X.2JM r6 = new X.2JM
            r6.<init>()
            X.2JM r5 = new X.2JM
            r5.<init>()
            X.0Jx r3 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r0 = 2933(0xb75, float:4.11E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.0CA r4 = r3.A02()
            r3 = r16
            X.C0CA.A00(r4, r3, r0)
            java.lang.String r3 = "request"
            X.2JO r0 = r6.A00
            X.0CA r0 = r0.A02()
            r0.A0E(r4, r3)
            X.2JQ r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r4 = X.AbstractC40511uK.A00()
            java.util.Map r6 = r6.getParamsCopy()
            java.util.Map r7 = r5.getParamsCopy()
            java.lang.Class<X.Qfa> r8 = X.C59477Qfa.class
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.String r5 = "HidePromptNoteRequest"
            r11 = 0
            java.lang.String r13 = "xdt_hide_prompt_note"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.1ud r0 = r15.A00
            r1.A00 = r9
            java.lang.Object r3 = r0.A04(r3, r1)
            if (r3 != r2) goto L26
            return r2
        La8:
            r0 = 42
            X.MAT r1 = new X.MAT
            r1.<init>(r15, r5, r4, r0)
            goto L18
        Lb1:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lb7:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesApi.A05(java.lang.String, X.1Ds):java.lang.Object");
    }

    public final Object A06(String str, InterfaceC23621Ds interfaceC23621Ds, long j) {
        C25621Ms c25621Ms = new C25621Ms(this.A01, -2);
        c25621Ms.A06();
        c25621Ms.A0B("notes/get_emoji_reactions/");
        c25621Ms.A0E("note_id", j);
        c25621Ms.A9s("max_id", str);
        c25621Ms.A0R(C38854H9c.class, C41263IOe.class);
        return c25621Ms.A0N().A00(2077173395, interfaceC23621Ds);
    }
}
