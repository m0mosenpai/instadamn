package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* loaded from: classes5.dex */
public final class D50 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D50(MediaCommentListRepository mediaCommentListRepository, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = 2;
        this.A03 = mediaCommentListRepository;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    public static C2JO A00(C26083BgC c26083BgC, Object obj, Object obj2, String str) {
        ?? graphQlCallInput = new GraphQlCallInput();
        graphQlCallInput.A09(c26083BgC.A07, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        graphQlCallInput.A09(c26083BgC.A0A, "tagline");
        graphQlCallInput.A09(c26083BgC.A04, DevServerEntity.COLUMN_DESCRIPTION);
        graphQlCallInput.A09(c26083BgC.A0B, "new_persona_version_image_id");
        graphQlCallInput.A09(c26083BgC.A06, "image_prompt");
        graphQlCallInput.A09(str, "welcome_message");
        graphQlCallInput.A09((String) obj, "icebreaker_prompt_1");
        graphQlCallInput.A09((String) obj2, "icebreaker_prompt_2");
        return graphQlCallInput;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    public static C2JO A01(String str, String str2) {
        ?? graphQlCallInput = new GraphQlCallInput();
        graphQlCallInput.A09(str, "prompt");
        graphQlCallInput.A09(str2, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        return graphQlCallInput;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        String str2;
        Object obj3;
        String str3;
        int i;
        switch (this.A02) {
            case 0:
                obj3 = this.A03;
                str3 = this.A04;
                str = this.A05;
                obj2 = this.A01;
                str2 = this.A06;
                i = 0;
                return new D50(obj3, obj2, str3, str, str2, interfaceC23621Ds, i);
            case 1:
                obj3 = this.A03;
                str3 = this.A04;
                str = this.A05;
                obj2 = this.A01;
                str2 = this.A06;
                i = 1;
                return new D50(obj3, obj2, str3, str, str2, interfaceC23621Ds, i);
            case 2:
                return new D50((MediaCommentListRepository) this.A03, this.A05, this.A04, this.A06, interfaceC23621Ds);
            case 3:
                obj3 = this.A03;
                obj2 = this.A01;
                str2 = this.A06;
                str = this.A05;
                str3 = this.A04;
                i = 3;
                return new D50(obj3, obj2, str3, str, str2, interfaceC23621Ds, i);
            case 4:
                obj3 = this.A03;
                str2 = this.A06;
                str = this.A05;
                obj2 = this.A01;
                str3 = this.A04;
                i = 4;
                return new D50(obj3, obj2, str3, str, str2, interfaceC23621Ds, i);
            case 5:
                obj3 = this.A03;
                str3 = this.A04;
                obj2 = this.A01;
                str = this.A05;
                str2 = this.A06;
                i = 5;
                return new D50(obj3, obj2, str3, str, str2, interfaceC23621Ds, i);
            case 6:
                obj3 = this.A03;
                str = this.A05;
                str3 = this.A04;
                str2 = this.A06;
                obj2 = this.A01;
                i = 6;
                return new D50(obj3, obj2, str3, str, str2, interfaceC23621Ds, i);
            case 7:
                obj2 = this.A01;
                str = this.A05;
                str2 = this.A06;
                obj3 = this.A03;
                str3 = this.A04;
                i = 7;
                return new D50(obj3, obj2, str3, str, str2, interfaceC23621Ds, i);
            default:
                obj3 = this.A03;
                str = this.A05;
                str2 = this.A06;
                obj2 = this.A01;
                str3 = this.A04;
                i = 8;
                return new D50(obj3, obj2, str3, str, str2, interfaceC23621Ds, i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0892 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0524 A[LOOP:6: B:275:0x051e->B:277:0x0524, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0665 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0721  */
    /* JADX WARN: Type inference failed for: r2v144, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v37, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v98, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v99, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.facebook.graphql.calls.GraphQlCallInput, java.lang.Object, X.2JO] */
    /* JADX WARN: Type inference failed for: r8v14, types: [com.facebook.graphql.calls.GraphQlCallInput, java.lang.Object, X.2JO] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 2304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D50.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((D50) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D50(Object obj, Object obj2, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = obj2;
        this.A06 = str3;
    }
}
