package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.Arrays;

/* renamed from: X.94p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2048194p implements C2JL {
    public final SettableFuture A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16660sJ A02;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        String message = th.getMessage();
        if (message == null) {
            message = AbstractC111324zv.A00(639);
        }
        this.A00.set(message);
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(message);
        }
    }

    @Override // X.C2JL
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(AnonymousClass436 anonymousClass436) {
        C2JS c2js;
        String A00;
        C2JS c2js2;
        if (anonymousClass436 != null && (c2js2 = (C2JS) anonymousClass436.Bos()) != null) {
            c2js = c2js2.getOptionalTreeField(0, "xfb_post_dcp_features_upload(data:{\"data\":{\"examples\":$examples,\"flow\":$flow,\"use_case\":$use_case,\"use_case_version\":$use_case_version}})", C126135nA.class, -1243246760);
        } else {
            c2js = null;
        }
        if (c2js != null && c2js.hasFieldValue("is_success") && c2js.getCoercedBooleanField(1, "is_success")) {
            this.A00.set("SUCCESS");
            InterfaceC16820sZ interfaceC16820sZ = this.A01;
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
                return;
            }
            return;
        }
        String A002 = AbstractC111324zv.A00(1795);
        if (c2js == null || (A00 = c2js.getOptionalStringField(0, "error_message")) == null) {
            A00 = MSV.A00(169);
        }
        String format = String.format("%s%s", Arrays.copyOf(new Object[]{A002, A00}, 2));
        C14360o3.A07(format);
        this.A00.set(format);
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        if (interfaceC16660sJ == null) {
            return;
        }
        interfaceC16660sJ.invoke(format);
    }

    public C2048194p(SettableFuture settableFuture, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = settableFuture;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16660sJ;
    }
}
