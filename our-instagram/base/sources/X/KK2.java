package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.RemoteException;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1;
import com.instagram.bugreporter.BugReporterDrawingView;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes8.dex */
public final class KK2 extends C2AG {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public KK2(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        Bitmap copy;
        switch (this.A00) {
            case 0:
                C45473KBl c45473KBl = (C45473KBl) this.A02;
                Q4Q q4q = c45473KBl.A03;
                if (q4q != null) {
                    copy = q4q.getOverlayBitmap();
                } else {
                    BugReporterDrawingView bugReporterDrawingView = c45473KBl.A01;
                    if (bugReporterDrawingView != null) {
                        Bitmap bitmap = bugReporterDrawingView.A03;
                        if (bitmap == null && bugReporterDrawingView.A02 == null) {
                            throw AbstractC166987dD.A14("The drawing view has a size of zero, so creating a final bitmap does not make sense.");
                        }
                        if (bitmap == null) {
                            Bitmap bitmap2 = bugReporterDrawingView.A02;
                            if (bitmap2 != null) {
                                Bitmap.Config config = bitmap2.getConfig();
                                C14360o3.A0A(config);
                                copy = bitmap2.copy(config, true);
                                C14360o3.A0A(copy);
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            Bitmap.Config config2 = bitmap.getConfig();
                            C14360o3.A0A(config2);
                            copy = bitmap.copy(config2, true);
                            C14360o3.A07(copy);
                            Canvas A06 = AbstractC43592JPx.A06(copy);
                            Matrix A0Q = AbstractC166987dD.A0Q();
                            if (bugReporterDrawingView.A05 != null) {
                                A0Q.postTranslate(-r2.left, -r2.top);
                                float width = copy.getWidth();
                                if (bugReporterDrawingView.A05 != null) {
                                    float width2 = width / r0.width();
                                    float height = copy.getHeight();
                                    if (bugReporterDrawingView.A05 != null) {
                                        A0Q.postScale(width2, height / r0.height());
                                        A06.setMatrix(A0Q);
                                        A06.drawPath(bugReporterDrawingView.A08, bugReporterDrawingView.A07);
                                    } else {
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    }
                    throw new IOException("Failed to create overlay bitmap");
                }
                if (copy != null) {
                    C55077OaX c55077OaX = C55077OaX.A00;
                    AbstractC12990ll A0o = AbstractC166987dD.A0o(c45473KBl.A05);
                    String str = c45473KBl.A04;
                    if (str == null) {
                        C14360o3.A0F("imagePath");
                        throw C00O.createAndThrow();
                    }
                    Object A02 = c55077OaX.A02(copy, A0o, AbstractC166987dD.A11(AnonymousClass001.A0R(AbstractC25227BEk.A0w(str, 0, AbstractC001900j.A05(str, '.', str.length() - 1)), "_annotated.png")));
                    AbstractC09560e7.A00(A02);
                    try {
                        BugReportComposerFragment$onClickScreenshotThumbnail$1 bugReportComposerFragment$onClickScreenshotThumbnail$1 = c45473KBl.A00;
                        if (bugReportComposerFragment$onClickScreenshotThumbnail$1 == null) {
                            return A02;
                        }
                        C2ST.A00(AnonymousClass191.A00, new MCK(bugReportComposerFragment$onClickScreenshotThumbnail$1, A02, (InterfaceC23621Ds) null, 3));
                        return A02;
                    } catch (RuntimeException e) {
                        C0K8.A05(C45473KBl.class, "Failed to save annotated screenshot.", e);
                        throw new Exception("Failed to save annotated screenshot", e);
                    }
                }
                throw new IOException("Failed to create overlay bitmap");
            case 1:
                Bundle bundle = null;
                try {
                    C47699L4g c47699L4g = (C47699L4g) this.A01;
                    SPT spt = C47699L4g.A07;
                    LI3 li3 = c47699L4g.A06;
                    Bundle A0b = AbstractC166987dD.A0b();
                    LKR.A01(A0b);
                    try {
                        Bundle A01 = LI3.A01(A0b, li3);
                        if (A01 == null) {
                            z = false;
                        } else {
                            bundle = A01.deepCopy();
                            AbstractC46568Kj7.A00(bundle);
                            z = true;
                        }
                        if (!z) {
                            return null;
                        }
                        SPT spt2 = C47699L4g.A07;
                        if (bundle.containsKey("startMessage")) {
                            return spt2.A02(bundle.getByteArray("startMessage"));
                        }
                        throw new IllegalStateException();
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (C52P | RemoteException | IllegalStateException | SecurityException e3) {
                    C0w9.A06("ConfidenceFrameworkHelper", "confidence_framework_client_start_query_failed", e3);
                    return null;
                }
            case 2:
                C69703Vty c69703Vty = (C69703Vty) this.A01;
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(c69703Vty.A01));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read != -1) {
                                byteArrayOutputStream.write(bArr, 0, read);
                            } else {
                                return byteArrayOutputStream.toString(ReactWebViewManager.HTML_ENCODING);
                            }
                        }
                    } finally {
                        bufferedInputStream.close();
                    }
                } catch (Exception unused) {
                    Context context = ((V1i) this.A02).getContext();
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Failure to read raw JSON from ");
                    C9GR.A00(context, AbstractC166997dE.A0v(c69703Vty.A00, A1C), null, 1);
                    bufferedInputStream.close();
                    return null;
                }
            default:
                C117035Rm c117035Rm = (C117035Rm) this.A02;
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                AbstractC117025Rl.A00(A0A, c117035Rm);
                A0A.close();
                return AbstractC166987dD.A19(stringWriter);
        }
    }

    @Override // X.C11R
    public final int getRunnableId() {
        switch (this.A00) {
            case 0:
                return 255;
            case 1:
                return 316234685;
            case 2:
                return 247;
            default:
                return 1656887534;
        }
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(exc, 0);
                InterfaceC58266PsA interfaceC58266PsA = ((C45473KBl) this.A02).A02;
                if (interfaceC58266PsA == null) {
                    C14360o3.A0F("userFlowLoggerV2");
                    throw C00O.createAndThrow();
                }
                interfaceC58266PsA.AWB("image_annotation_failure", new C50259MHo(exc, 30));
                C0K8.A05(C45473KBl.class, "Failed to save annotated screenshot.", exc);
                ((Dialog) this.A01).dismiss();
                C9GR.A07(AbstractC12290kX.A00, 2131954366);
                return;
            case 1:
            case 2:
            default:
                super.onFail(exc);
                return;
            case 3:
                C9GR.A06((Context) this.A01, 2131958524);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    @Override // X.C2AH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L74;
                case 1: goto L3a;
                case 2: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = X.AbstractC167027dH.A0Q(r9)
            java.lang.Object r1 = r8.A01
            android.content.Context r1 = (android.content.Context) r1
            X.AbstractC13900nG.A00(r1, r0)
            r0 = 2131958523(0x7f131afb, float:1.955366E38)
            X.C9GR.A06(r1, r0)
        L16:
            return
        L17:
            java.lang.String r9 = (java.lang.String) r9
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2d
            r1.<init>(r9)     // Catch: org.json.JSONException -> L2d
            r0 = 2
            java.lang.String r1 = r1.toString(r0)     // Catch: org.json.JSONException -> L2d
            if (r1 == 0) goto L2d
            int r0 = r1.length()
            if (r0 == 0) goto L2d
            r9 = r1
            goto L2f
        L2d:
            if (r9 == 0) goto L16
        L2f:
            java.lang.Object r0 = r8.A02
            X.V1i r0 = (X.V1i) r0
            X.UGi r1 = r0.A01
            if (r1 != 0) goto L9a
            java.lang.String r0 = "adapter"
            goto L7e
        L3a:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L16
            java.lang.Object r7 = r8.A01
            X.L4g r7 = (X.C47699L4g) r7
            X.SPT r0 = X.C47699L4g.A07
            android.content.Context r1 = r7.A01
            java.lang.Object r6 = r8.A02
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            r5 = 1
            X.1Ms r4 = X.AbstractC167017dG.A0c(r6)
            java.lang.String r0 = "accounts/init_confidence_flow/"
            r4.A0B(r0)
            java.lang.String r0 = "client_start_message"
            boolean r3 = X.JQ0.A1W(r1, r4, r6, r0, r9)
            java.lang.Class<X.K7t> r2 = X.K7t.class
            java.lang.Class<X.LAn> r1 = X.C47827LAn.class
            X.0a8 r0 = X.C07340a8.A00
            r4.A0P(r0, r2, r1, r3)
            r4.A0R = r5
            X.1ON r1 = r4.A0N()
            X.KEe r0 = new X.KEe
            r0.<init>(r6, r7)
            r1.A00 = r0
            X.C1GJ.A03(r1)
            return
        L74:
            java.lang.Object r2 = r8.A02
            X.KBl r2 = (X.C45473KBl) r2
            X.PsA r1 = r2.A02
            if (r1 != 0) goto L86
            java.lang.String r0 = "userFlowLoggerV2"
        L7e:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L86:
            java.lang.String r0 = "image_annotation_success"
            r1.AW9(r0)
            java.lang.Object r0 = r8.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            X.0h2 r0 = r2.mFragmentManager
            if (r0 == 0) goto L16
            r0.A0b()
            return
        L9a:
            r1.A00 = r9
            r0 = 0
            r1.notifyItemChanged(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KK2.onSuccess(java.lang.Object):void");
    }
}
