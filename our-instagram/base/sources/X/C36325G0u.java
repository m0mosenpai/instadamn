package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.Constants;
import com.instagram.avatar.AddAvatarHelper$LoadedImage$LoadedImageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.crop.AvatarCropActivity;
import com.instagram.model.creation.MediaCaptureConfig;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.G0u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36325G0u implements InterfaceC69913Ca, CallerContextable {
    public static final String __redex_internal_original_name = "AddAvatarHelper";
    public FIF A00;
    public InterfaceC69973Cg A01;
    public ELT A02;
    public File A03;
    public File A04;
    public boolean A05;
    public CharSequence[] A06;
    public final UserSession A07;

    public C36325G0u(Bundle bundle, UserSession userSession, ELT elt) {
        C14360o3.A0B(userSession, 2);
        this.A02 = elt;
        this.A07 = userSession;
        this.A06 = new CharSequence[0];
        if (bundle != null) {
            if (bundle.containsKey("AddAvatarHelper.IMAGE_METADATA")) {
                Parcelable parcelable = bundle.getParcelable("AddAvatarHelper.IMAGE_METADATA");
                if (parcelable != null) {
                    AddAvatarHelper$LoadedImage$LoadedImageMetadata addAvatarHelper$LoadedImage$LoadedImageMetadata = (AddAvatarHelper$LoadedImage$LoadedImageMetadata) parcelable;
                    new AsyncTaskC31737Dwq(addAvatarHelper$LoadedImage$LoadedImageMetadata.A01, this, addAvatarHelper$LoadedImage$LoadedImageMetadata.A00).execute(new Void[0]);
                    bundle.remove("AddAvatarHelper.IMAGE_METADATA");
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            String string = bundle.getString("tempCameraPhotoFile");
            if (string != null) {
                this.A04 = new File(string);
            }
            String string2 = bundle.getString("tempGalleryPhotoFile");
            if (string2 != null) {
                this.A03 = new File(string2);
            }
        }
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void CKE(Intent intent) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final void En7(File file, int i) {
        C14360o3.A0B(file, 0);
        ELT elt = this.A02;
        if (elt != null) {
            LJR.A03(elt, file, i);
        }
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void EnX(Intent intent, int i) {
    }

    public static final void A00(android.net.Uri uri, C36325G0u c36325G0u) {
        ELT elt = c36325G0u.A02;
        if (elt != null) {
            Context requireContext = elt.requireContext();
            UserSession userSession = c36325G0u.A07;
            Bundle bundle = new O2L(requireContext).A00;
            bundle.putParcelable(MSV.A00(156), uri);
            bundle.putBoolean(AbstractC43591JPw.A00(243), true);
            bundle.putInt(MSV.A00(157), 1080);
            Intent intent = new Intent(requireContext, (Class<?>) AvatarCropActivity.class);
            intent.putExtras(bundle);
            AbstractC31173DnH.A18(intent, userSession);
            C12260kU.A06(elt, intent, 3);
        }
    }

    public static final void A01(C36325G0u c36325G0u) {
        File parentFile;
        ELT elt = c36325G0u.A02;
        if (elt != null) {
            Context requireContext = elt.requireContext();
            String A00 = AbstractC196848nE.A00(System.currentTimeMillis());
            C14360o3.A07(A00);
            File cacheDir = requireContext.getCacheDir();
            C14360o3.A07(cacheDir);
            File file = new File(AnonymousClass001.A0u(cacheDir.getAbsolutePath(), "/images/", A00, ".jpg"));
            c36325G0u.A04 = file;
            String A002 = AbstractC58317Pt9.A00(677);
            try {
                parentFile = file.getParentFile();
            } catch (IOException unused) {
            }
            if (parentFile != null) {
                parentFile.mkdirs();
                file.createNewFile();
                Runtime.getRuntime().exec(AnonymousClass001.A0R("chmod 0666", file.getPath()));
                Context requireContext2 = elt.requireContext();
                Intent intent = new Intent(A002);
                android.net.Uri A003 = FileProvider.A00(requireContext2, file);
                C14360o3.A07(A003);
                intent.addFlags(3);
                PackageManager packageManager = requireContext2.getPackageManager();
                if (packageManager != null) {
                    List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, Constants.LOAD_RESULT_PGO_ATTEMPTED);
                    C14360o3.A07(queryIntentActivities);
                    Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                    while (it.hasNext()) {
                        ActivityInfo activityInfo = it.next().activityInfo;
                        if (activityInfo != null) {
                            String str = ((PackageItemInfo) activityInfo).packageName;
                            C14360o3.A06(str);
                            requireContext2.grantUriPermission(str, A003, 3);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    intent.putExtra("output", A003);
                    C12260kU.A07(elt, intent, 4);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public final void A02() {
        InterfaceC69973Cg interfaceC69973Cg = this.A01;
        if (interfaceC69973Cg != null) {
            EnumC69983Ch enumC69983Ch = EnumC69983Ch.A05;
            C43846JaA c43846JaA = new C43846JaA(enumC69983Ch);
            c43846JaA.A03 = true;
            c43846JaA.A05 = false;
            c43846JaA.A09 = true;
            c43846JaA.A0C = false;
            c43846JaA.A0D = false;
            c43846JaA.A0A = false;
            interfaceC69973Cg.EoI(EnumC33447EqK.A0J, new MediaCaptureConfig(c43846JaA), enumC69983Ch);
        }
    }
}
