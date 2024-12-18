package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.text.Html;
import android.text.Spanned;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class KK4 extends C2AG {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public KK4(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0288, code lost:
    
        if (r1.A02 == false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022e A[LOOP:0: B:117:0x0228->B:119:0x022e, LOOP_END] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KK4.call():java.lang.Object");
    }

    @Override // X.C11R
    public final int getRunnableId() {
        switch (this.A00) {
            case 2:
                return 295;
            case 3:
                return 662;
            case 4:
                return 178336291;
            case 5:
                return 439;
            case 6:
                return 252;
            default:
                return 508;
        }
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        switch (this.A00) {
            case 2:
                AbstractC12120kG.A0H("NewGalleryPhotoImportFailed", exc);
                return;
            case 3:
                C14360o3.A0B(exc, 0);
                String A00 = MSV.A00(92);
                C0w9.A06("ClipsDraftPendingMediaHelper", A00, exc);
                ((InterfaceC50452MPg) this.A01).D8I(A00);
                return;
            case 4:
            default:
                super.onFail(exc);
                return;
            case 5:
                C0w9.A07("Could not determine TOS display status", exc);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        C25621Ms A0c;
        switch (this.A00) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    return;
                }
                C47955LGq c47955LGq = (C47955LGq) this.A03;
                c47955LGq.A00 = bitmap;
                c47955LGq.A01 = BlurUtil.blur(bitmap, 0.3f, 25);
                KFE kfe = (KFE) this.A02;
                c47955LGq.A02(kfe);
                if (!kfe.A0N.isResumed() || kfe.A03 != EnumC46213Kcp.A09) {
                    return;
                }
                KFE.A07(kfe);
                return;
            case 1:
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    return;
                }
                ((LGZ) this.A01).A00 = bitmap2;
                KFE kfe2 = (KFE) this.A03;
                if (!kfe2.A0N.isResumed() || kfe2.A03 != EnumC46213Kcp.A0A) {
                    return;
                }
                KFE.A03(kfe2);
                return;
            case 2:
                C44262Jh8 c44262Jh8 = (C44262Jh8) obj;
                InterfaceC197178nn interfaceC197178nn = c44262Jh8.A02;
                if (interfaceC197178nn != null && interfaceC197178nn.Avl() != null) {
                    MediaCaptureActivity mediaCaptureActivity = (MediaCaptureActivity) this.A01;
                    String Avl = interfaceC197178nn.Avl();
                    Location location = (Location) this.A02;
                    ExifImageData exifImageData = c44262Jh8.A01;
                    exifImageData.getClass();
                    int i = exifImageData.A00;
                    HashMap hashMap = exifImageData.A03;
                    hashMap.getClass();
                    Medium medium = (Medium) this.A03;
                    String str = medium.A0Y;
                    MediaUploadMetadata mediaUploadMetadata = medium.A0G;
                    String str2 = medium.A0N;
                    String str3 = medium.A0X;
                    String str4 = medium.A0W;
                    if (str4 != null) {
                        MediaCaptureActivity.A02(location, AbstractC25227BEk.A0B(str4), mediaUploadMetadata, mediaCaptureActivity, null, Avl, str, str2, str3, medium.A0M, medium.A0P, medium.A0Q, medium.A0S, null, hashMap, i, 0);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                AbstractC12120kG.A0H("NewGalleryPhotoImportFailed", AbstractC166987dD.A12("Null image data path in result"));
                return;
            case 3:
                C47Z c47z = (C47Z) obj;
                C14360o3.A0B(c47z, 0);
                ((InterfaceC50452MPg) this.A01).D8J(c47z);
                return;
            case 4:
                String str5 = (String) obj;
                if (str5 == null) {
                    return;
                }
                C47699L4g c47699L4g = (C47699L4g) this.A01;
                SPT spt = C47699L4g.A07;
                Context context = c47699L4g.A01;
                UserSession userSession = (UserSession) this.A03;
                z = true;
                C14360o3.A0B(userSession, 1);
                A0c = AbstractC167017dG.A0c(userSession);
                A0c.A0B("accounts/try_verify_challenge_response_and_log_result/");
                A0c.A0P(C07340a8.A00, K7z.class, C47833LAt.class, JQ0.A1W(context, A0c, userSession, "auth_response", str5));
                A0c.A0R = z;
                C1GJ.A03(A0c.A0N());
                return;
            case 5:
                if (!AbstractC166987dD.A1a(obj)) {
                    return;
                }
                Activity activity = (Activity) this.A01;
                Object obj2 = this.A03;
                Object obj3 = this.A02;
                String string = activity.getString(2131968121, AbstractC167007dF.A0f(activity, activity.getString(2131964756), 2131968120), AbstractC167007dF.A0f(activity, activity.getString(2131969935), 2131968119), AbstractC167007dF.A0f(activity, activity.getString(2131968123), 2131968118));
                C193328hC A0H = AbstractC31171DnF.A0H(activity);
                A0H.A0A(2131975704);
                if (string == null) {
                    string = "";
                }
                Spanned fromHtml = Html.fromHtml(string);
                C14360o3.A07(fromHtml);
                A0H.A0r(fromHtml);
                A0H.A0s(false);
                A0H.A0J(new DialogInterfaceOnClickListenerC35450Fk7(21, activity, obj3, obj2), 2131968122);
                Dialog A02 = A0H.A02();
                A02.setOnKeyListener(new DialogInterfaceOnKeyListenerC63430Sk9(activity, 2));
                C0fJ.A00(A02);
                return;
            default:
                String str6 = (String) obj;
                if (str6 != null && str6.length() != 0) {
                    C41451vu.A01.E4s(new C36044Fvg(str6));
                    AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                    if (C0BQ.A00(abstractC12990ll).BOZ() > 0) {
                        C19280xC A04 = C1Q9.A0T.A02(abstractC12990ll).A04();
                        A04.A0C("flow", "email");
                        AbstractC31173DnH.A1S(A04, abstractC12990ll);
                        A0c = AbstractC167017dG.A0c(abstractC12990ll);
                        A0c.A0B("accounts/confirm_email_with_open_id_token/");
                        A0c.A9s("id_token", str6);
                        A0c.A0R(C40781ul.class, C55702hA.class);
                        z = true;
                        A0c.A0R = z;
                        C1GJ.A03(A0c.A0N());
                        return;
                    }
                    return;
                }
                C35269Fh4.A04(null, (AbstractC12990ll) this.A02, "email", "empty_token", 0.0d, 0.0d);
                return;
        }
    }
}
