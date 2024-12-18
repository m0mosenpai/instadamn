package X;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.TextureView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7q4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC174697q4 {
    public static final HandlerC174707q5 A01 = new HandlerC174707q5(Looper.getMainLooper());
    public static final InterfaceC174727q7 A00 = new InterfaceC174727q7() { // from class: X.7q6
        @Override // X.InterfaceC174727q7
        public final void Do5() {
        }

        @Override // X.InterfaceC174727q7
        public final void DWd(String str) {
            C73299Xzp.A00("cameraOpened", str);
        }

        @Override // X.InterfaceC174727q7
        public final void Dea(String str) {
            C73299Xzp.A00("cameraReleased", str);
        }
    };

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.7qA] */
    public static C174757qB A01(Context context, InterfaceC174657pz interfaceC174657pz, InterfaceC174637px interfaceC174637px, UserSession userSession, String str, int i) {
        TextureView textureView = new TextureView(context);
        EnumC177227uI A002 = AnonymousClass820.A00(context);
        ?? obj = new Object();
        obj.A01 = textureView;
        textureView.setOpaque(false);
        return new C174757qB(textureView, A002, interfaceC174657pz, interfaceC174637px, null, obj, userSession, str, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1 == false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.7qA] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C174757qB A02(android.view.ViewStub r12, X.InterfaceC174657pz r13, X.InterfaceC174637px r14, X.InterfaceC1813882q r15, com.instagram.common.session.UserSession r16, java.lang.String r17, int r18, boolean r19) {
        /*
            r0 = 1
            r10 = r18
            r11 = r19
            if (r10 != r0) goto L10
            boolean r1 = X.C8Li.A03(r11)
            r0 = 2131628123(0x7f0e105b, float:1.888353E38)
            if (r1 != 0) goto L13
        L10:
            r0 = 2131628124(0x7f0e105c, float:1.8883532E38)
        L13:
            r12.setLayoutResource(r0)
            android.view.View r2 = r12.inflate()
            X.AbstractC185998Mt.A00(r2)
            android.content.Context r0 = r12.getContext()
            X.7uI r3 = X.AnonymousClass820.A00(r0)
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r1 = r2.requireViewById(r0)
            X.7qA r7 = new X.7qA
            r7.<init>()
            boolean r0 = r1 instanceof android.view.TextureView
            if (r0 == 0) goto L55
            android.view.TextureView r1 = (android.view.TextureView) r1
            r7.A01 = r1
            r0 = 0
            r1.setOpaque(r0)
        L3d:
            X.7qB r1 = new X.7qB
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 2131433008(0x7f0b1630, float:1.848779E38)
            android.view.View r0 = r2.requireViewById(r0)
            com.instagram.camera.capture.IgCameraFocusView r0 = (com.instagram.camera.capture.IgCameraFocusView) r0
            r1.A05 = r0
            return r1
        L55:
            boolean r0 = r1 instanceof android.view.SurfaceView
            if (r0 == 0) goto L5e
            android.view.SurfaceView r1 = (android.view.SurfaceView) r1
            r7.A00 = r1
            goto L3d
        L5e:
            java.lang.String r1 = "CameraView must be a TextureView or SurfaceView!"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC174697q4.A02(android.view.ViewStub, X.7pz, X.7px, X.82q, com.instagram.common.session.UserSession, java.lang.String, int, boolean):X.7qB");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (X.C0JS.A05(r1, "com.facebook.stella_debug") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        if (X.C18U.A06(r2, r8, r0) == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC174767qC A00(android.content.Context r7, com.instagram.common.session.UserSession r8, java.lang.String r9) {
        /*
            int r0 = r9.hashCode()
            r4 = r7
            switch(r0) {
                case 1008452164: goto La6;
                case 1040300701: goto L96;
                case 1554394706: goto L86;
                default: goto L8;
            }
        L8:
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 2342155149521126328(0x208101b3000f03b8, double:4.058921527659047E-152)
            boolean r0 = X.C18U.A06(r3, r8, r0)
            r2 = 0
            if (r0 == 0) goto L5e
            X.C14360o3.A0B(r8, r2)
            r0 = 36330720336233461(0x811299001343f5, double:3.039032060478061E-306)
            boolean r0 = X.C18U.A06(r3, r8, r0)
            if (r0 == 0) goto L46
            X.C14360o3.A0B(r7, r2)
            java.lang.String r2 = "com.facebook.stella_debug"
            java.lang.String r0 = "com.facebook.stella"
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            boolean r0 = X.C0JS.A05(r1, r0)
            if (r0 != 0) goto L3b
            boolean r0 = X.C0JS.A05(r1, r2)
            if (r0 == 0) goto L5e
        L3b:
            r1 = 0
            r5 = 3
            r0 = r7
            r2 = r1
            r3 = r8
            r4 = r9
            X.7qB r3 = A01(r0, r1, r2, r3, r4, r5)
        L45:
            return r3
        L46:
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            if (r1 == 0) goto L5e
            java.lang.String r0 = "com.facebook.stella"
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L55
            if (r0 == 0) goto L55
            goto L3b
        L55:
            java.lang.String r0 = "com.facebook.stella_debug"
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e
            if (r0 == 0) goto L5e
            goto L3b
        L5e:
            X.7uI r6 = X.AnonymousClass820.A00(r7)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            X.7wE r5 = X.C178347w8.A00(r8, r9, r0)
            X.7q5 r0 = X.AbstractC174697q4.A01
            X.7rz r7 = new X.7rz
            r7.<init>(r5, r0)
            X.AcN r3 = new X.AcN
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.Xzp r0 = X.C73299Xzp.A02
            if (r0 == 0) goto L45
            X.7q7 r1 = X.AbstractC174697q4.A00
            X.7qg r0 = r3.A06
            r0.A8v(r1)
            return r3
        L86:
            java.lang.String r0 = "live_with_guest"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L8
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36312140307301303(0x8101b3000d03b7, double:3.027281975365593E-306)
            goto Lb5
        L96:
            java.lang.String r0 = "live_with_join_flow"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L8
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36312140307235766(0x8101b3000c03b6, double:3.027281975324147E-306)
            goto Lb5
        La6:
            java.lang.String r0 = "live_base"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L8
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36312140307039156(0x8101b3000903b4, double:3.02728197519981E-306)
        Lb5:
            boolean r0 = X.C18U.A06(r2, r8, r0)
            if (r0 != 0) goto L3b
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC174697q4.A00(android.content.Context, com.instagram.common.session.UserSession, java.lang.String):X.7qC");
    }

    public static String A03(Exception exc) {
        Throwable cause = exc.getCause();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            Exception exc2 = exc;
            exc = cause;
            if (cause == null || C2I7.A00(cause, exc2)) {
                break;
            }
            StackTraceElement[] stackTrace = cause.getStackTrace();
            sb.append("\nLevel [");
            sb.append(i);
            sb.append("]");
            sb.append("\n");
            sb.append(exc2.getCause());
            sb.append("\n");
            sb.append(TextUtils.join("\n", stackTrace));
            sb.append("\n\n--------------------------------\n");
            i++;
            cause = cause.getCause();
            if (i == 5) {
                sb.append("\n Warning: Reached maximum stack levels!");
                break;
            }
        }
        return sb.toString();
    }
}
