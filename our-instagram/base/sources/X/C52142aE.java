package X;

/* renamed from: X.2aE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52142aE extends C0YY implements InterfaceC16620sF {
    public static final C52142aE A00 = new C52142aE();

    public C52142aE() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        String str = (String) obj;
        AbstractC115105If abstractC115105If = (AbstractC115105If) obj2;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(abstractC115105If, 1);
        InterfaceC40801un interfaceC40801un = (InterfaceC40801un) abstractC115105If.A00();
        StringBuilder sb = new StringBuilder();
        if (interfaceC40801un instanceof C40781ul) {
            C40781ul c40781ul = (C40781ul) interfaceC40801un;
            if (c40781ul.mErrorBody != null && (!AbstractC001900j.A0T(r0))) {
                sb.append(AnonymousClass001.A0g("error_body: ", c40781ul.mErrorBody, ", "));
            }
            if (c40781ul.getErrorMessage() != null && (!AbstractC001900j.A0T(r0))) {
                sb.append(AnonymousClass001.A0R("error_message: ", c40781ul.getErrorMessage()));
            }
            if (c40781ul.mErrorSource != null && (!AbstractC001900j.A0T(r0))) {
                sb.append(AnonymousClass001.A0R("error_source: ", c40781ul.mErrorSource));
            }
            if (c40781ul.mErrorTitle != null && (!AbstractC001900j.A0T(r0))) {
                sb.append(AnonymousClass001.A0R("error_title: ", c40781ul.mErrorTitle));
            }
            if (c40781ul.mErrorType != null && (!AbstractC001900j.A0T(r0))) {
                sb.append(AnonymousClass001.A0R("error_type: ", c40781ul.mErrorType));
            }
            i = c40781ul.mStatusCode;
        } else {
            i = 0;
        }
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            Throwable cause = A01.getCause();
            if (cause != null) {
                A01 = cause;
            }
            String message = A01.getMessage();
            C52092a9 c52092a9 = C52092a9.A00;
            StringBuilder sb2 = new StringBuilder();
            StackTraceElement[] stackTrace = A01.getStackTrace();
            C14360o3.A07(stackTrace);
            String str2 = null;
            int i2 = 0;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!C14360o3.A0K(stackTraceElement.getClassName(), str2)) {
                    str2 = stackTraceElement.getClassName();
                    sb2.append(stackTraceElement.toString());
                    sb2.append("\n");
                    i2++;
                }
                if (i2 == 8) {
                    break;
                }
            }
            String obj3 = sb2.toString();
            C14360o3.A07(obj3);
            sb.append(AnonymousClass001.A0u("fault_message: ", message, ", fault_stacktrace: ", obj3));
        }
        C52092a9 c52092a92 = C52092a9.A00;
        String obj4 = sb.toString();
        C14360o3.A07(obj4);
        C52092a9.A00(new C100364ey(str, i, obj4));
        return C0eB.A00;
    }
}
