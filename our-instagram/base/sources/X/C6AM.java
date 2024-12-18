package X;

import com.instagram.common.lispy.lang.BloksScript;

/* renamed from: X.6AM, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6AM {
    public static AnonymousClass632 A00(C6FQ c6fq) {
        C6FG c6fg;
        AnonymousClass632 anonymousClass632 = c6fq.A04;
        if (anonymousClass632 != null || ((c6fg = c6fq.A03) != null && (anonymousClass632 = AnonymousClass634.A02(c6fg).A05()) != null)) {
            return anonymousClass632;
        }
        throw new NullPointerException("No tree resources available in the Scripting Environment. This is an infra error that you should post in the Bloks Q&A group about.");
    }

    public static C62516SEs A01(C6FQ c6fq, String str) {
        C62516SEs c62516SEs = (C62516SEs) A00(c6fq).A04.get(str);
        if (c62516SEs != null) {
            return c62516SEs;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R(AnonymousClass001.A0g("Payload for referenced embedded payload id ", str, " not found!"), "\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about."));
    }

    public static BloksScript A02(C6FQ c6fq, String str) {
        C1338862w c1338862w = A00(c6fq).A00;
        C14360o3.A0B(str, 1);
        BloksScript bloksScript = (BloksScript) c1338862w.A00.get(str);
        if (bloksScript != null) {
            BloksScript A00 = bloksScript.A00(c6fq.A02, c6fq.A0D);
            if (A00 instanceof InterfaceC103374lD) {
                A00.ASn(c6fq.A00);
            }
            return A00;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R("Expression for Script ID not found!", "\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about."));
    }

    public static Object A03(C6FQ c6fq, String str) {
        Object obj = A00(c6fq).A08.get(str);
        InterfaceC136406Ft interfaceC136406Ft = c6fq.A05;
        if (interfaceC136406Ft != null) {
            interfaceC136406Ft.A7j(str);
        }
        return obj;
    }
}
