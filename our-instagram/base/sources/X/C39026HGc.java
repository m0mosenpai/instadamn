package X;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.instagram.api.schemas.CommentAudienceControlType;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.user.model.User;

/* renamed from: X.HGc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39026HGc extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C39026HGc(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    public static void A00(C39026HGc c39026HGc, HAY hay) {
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) c39026HGc.A02;
        C14360o3.A0B(abstractC12990ll, 0);
        ((C42343Ip5) abstractC12990ll.A01(C42343Ip5.class, J8N.A00)).A00(hay.A00, c39026HGc.A03);
        ((JHP) c39026HGc.A01).Dq0(hay.A00);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1860561516);
                if (((ReactContextBaseJavaModule) this.A01).getCurrentActivity() != null) {
                    InterfaceC65622ToD interfaceC65622ToD = (InterfaceC65622ToD) this.A02;
                    Object A00 = abstractC115105If.A00();
                    if (A00 != null) {
                        str = ((InterfaceC40821up) A00).getErrorMessage();
                    } else {
                        str = "";
                    }
                    interfaceC65622ToD.reject(IgReactCommentModerationModule.ERROR_SERVER_ERR, str);
                }
                i = -2034099791;
                break;
            case 1:
                A03 = C0f9.A03(-696309727);
                ((JHP) this.A01).DFf();
                i = -1962988607;
                break;
            case 2:
                A03 = C0f9.A03(-210668784);
                ((JHP) this.A01).DFf();
                i = 1409507780;
                break;
            default:
                A03 = C0f9.A03(972808447);
                ((JHP) this.A01).DFf();
                i = 1544303958;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(417308666);
                int A032 = C0f9.A03(-1594372894);
                ReactContextBaseJavaModule reactContextBaseJavaModule = (ReactContextBaseJavaModule) this.A01;
                if (reactContextBaseJavaModule.getCurrentActivity() != null) {
                    User A10 = AbstractC166987dD.A10(C023409i.A0A.A06(reactContextBaseJavaModule.getCurrentActivity().getIntent().getExtras()));
                    CommentAudienceControlType commentAudienceControlType = (CommentAudienceControlType) CommentAudienceControlType.A01.get(this.A03);
                    if (commentAudienceControlType == null) {
                        commentAudienceControlType = CommentAudienceControlType.A08;
                    }
                    A10.A03.EPY(commentAudienceControlType);
                    ((InterfaceC65622ToD) this.A02).resolve(null);
                }
                C0f9.A0A(1184856457, A032);
                i = 1548383902;
                break;
            case 1:
                A03 = C0f9.A03(1560125587);
                int A033 = C0f9.A03(-1236197614);
                A00(this, (HAY) obj);
                C0f9.A0A(-1808148217, A033);
                i = 1345084737;
                break;
            case 2:
                A03 = C0f9.A03(1308381953);
                int A034 = C0f9.A03(422145234);
                A00(this, (HAY) obj);
                C0f9.A0A(1918212699, A034);
                i = 1136647411;
                break;
            default:
                A03 = C0f9.A03(-1697434873);
                int A035 = C0f9.A03(-1711258505);
                A00(this, (HAY) obj);
                C0f9.A0A(1149063511, A035);
                i = 351953622;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
