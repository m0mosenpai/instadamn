package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.deadcodedetection.DeadCodeFunctionMutationResponseImpl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0uk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18040uk implements InterfaceC70433Ec {
    public final C2JM A00 = new C2JM();
    public final C2JM A01 = new C2JM();

    @Override // X.InterfaceC70433Ec
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final PandoGraphQLRequest A00() {
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AbstractC40511uK.A00(), "DeadCodeFunctionMutation", this.A00.getParamsCopy(), this.A01.getParamsCopy(), DeadCodeFunctionMutationResponseImpl.class, true, null, 0, null, "xdt_upload_function_ids", new ArrayList());
    }

    public final /* bridge */ /* synthetic */ void A02(String str) {
        this.A00.A04("device_os_version", str);
    }

    public final /* bridge */ /* synthetic */ void A03(String str) {
        this.A00.A04("process_name", str);
    }

    public final /* bridge */ /* synthetic */ void A04(String str) {
        this.A00.A04(AbstractC006902j.A00(9, 10, 89), str);
    }

    public final /* bridge */ /* synthetic */ void A05(List list) {
        this.A00.A05("function_ids", list);
    }
}
