package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class WGT {
    public static final RemoteMedia A00(C66621UPi c66621UPi) {
        Integer num;
        C14360o3.A0B(c66621UPi, 0);
        String str = c66621UPi.A06;
        Long l = null;
        android.net.Uri A03 = AbstractC08820cl.A03(str);
        C14360o3.A07(A03);
        SimpleImageUrl A00 = AbstractC81033jX.A00(A03, -1, -1);
        android.net.Uri A032 = AbstractC08820cl.A03(c66621UPi.A07);
        C14360o3.A07(A032);
        SimpleImageUrl A002 = AbstractC81033jX.A00(A032, -1, -1);
        if (c66621UPi.A08) {
            num = Integer.valueOf(c66621UPi.A00);
        } else {
            num = null;
        }
        String str2 = c66621UPi.A05;
        boolean z = c66621UPi.A09;
        int i = c66621UPi.A01;
        if (num != null) {
            l = Long.valueOf(num.intValue());
        }
        return new RemoteMedia(c66621UPi.A04, A00, A002, Integer.valueOf(c66621UPi.A02), Integer.valueOf(c66621UPi.A03), l, str2, str, i, z, false, false);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.instagram.common.gallery.metadata.ImmersiveMediaFields, java.lang.Object] */
    public static final C66621UPi A01(C67536Una c67536Una, List list, int i, boolean z, boolean z2) {
        String str;
        C2JS optionalTreeField;
        String requiredStringField = c67536Una.getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C14360o3.A07(requiredStringField);
        int coercedIntField = c67536Una.getCoercedIntField(1, IgReactMediaPickerNativeModule.HEIGHT);
        int A00 = c67536Una.A00(IgReactMediaPickerNativeModule.WIDTH);
        String requiredStringField2 = c67536Una.getRequiredStringField(3, "src");
        C14360o3.A07(requiredStringField2);
        String A0B = c67536Una.A0B("thumbnail");
        if (A0B == null) {
            A0B = c67536Una.getRequiredStringField(3, "src");
            C14360o3.A07(A0B);
        }
        boolean hasFieldValue = c67536Una.A0E().hasFieldValue("ctime");
        int coercedIntField2 = c67536Una.A0E().getCoercedIntField(1, "ctime");
        String requiredStringField3 = c67536Una.getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String A09 = c67536Una.A0E().A09("app_attribution_namespace");
        C2JS optionalTreeField2 = c67536Una.getOptionalTreeField(6, AbstractC111324zv.A00(2523), C66913Ud7.class, -932699525);
        if (optionalTreeField2 != null && (optionalTreeField = optionalTreeField2.getOptionalTreeField(0, "photo3d_info", C66912Ud6.class, -1193210058)) != null) {
            str = optionalTreeField.getOptionalStringField(0, "url");
        } else {
            str = null;
        }
        ?? obj = new Object();
        obj.A00 = str;
        obj.A01 = false;
        return new C66621UPi(new MediaUploadMetadata(obj, A09, null, null, null, requiredStringField3, null, null, null, null, null, false), requiredStringField, requiredStringField2, A0B, list, coercedIntField, A00, coercedIntField2, i, z, hasFieldValue, z2);
    }

    public static final List A04(List list) {
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(new GalleryItem((RemoteMedia) it.next()));
        }
        return A0q;
    }

    public static final List A05(java.util.Set set) {
        C14360o3.A0B(set, 0);
        ArrayList A0q = AbstractC167017dG.A0q(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A0q.add(A00((C66621UPi) it.next()));
        }
        return AbstractC001800i.A0g(A0q, new C9J7(7));
    }

    public static final void A06(Context context, UserSession userSession) {
        new C63397SjR(context, userSession, C2Fb.A2Y, C18U.A04(C06090Tz.A05, userSession, 36882653697278411L), false).A0A();
    }

    public final void A08(Activity activity, C22P c22p, UserSession userSession, String str, String str2) {
        C14360o3.A0B(c22p, 2);
        if (activity != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1884266413) {
                if (hashCode != 106855379) {
                    if (hashCode == 108390809 && str.equals("reels")) {
                        Bundle A00 = AbstractC86593tX.A0C(c22p).A00();
                        A00.putString("META_GALLERY_ALBUM_TYPE", str2);
                        C6XJ.A02(activity, A00, userSession, TransparentModalActivity.class, "clips_camera").A0A(activity, 9587);
                        return;
                    }
                    return;
                }
                if (!str.equals("posts")) {
                    return;
                }
                Intent intent = new Intent(activity, (Class<?>) MediaCaptureActivity.class);
                intent.putExtra("META_GALLERY_ALBUM_TYPE", str2);
                intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                intent.putExtra("cameraEntryPoint", c22p);
                AbstractC07840b2.A00(activity, intent, 100);
                return;
            }
            if (!str.equals("stories")) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("META_GALLERY_ALBUM_TYPE", str2);
            bundle.putSerializable("camera_entry_point", c22p);
            C6XJ A02 = C6XJ.A02(activity, bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(51));
            A02.A07();
            A02.A0C(activity);
        }
    }

    public static final VFY A02(AnonymousClass436 anonymousClass436) {
        C2JS c2js;
        C2JS A03;
        if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null && (A03 = c2js.A03(C66922UdG.class, "meta_gallery", -1545310103)) != null) {
            return (VFY) A03.getRequiredEnumField(0, AbstractC43591JPw.A00(186), VFY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }
        return null;
    }

    public static final ArrayList A03(C67536Una c67536Una) {
        String str;
        ImmutableList requiredCompactedEnumListField = c67536Una.A0E().getRequiredCompactedEnumListField(0, "source_albums", EnumC39600HeA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        ArrayList A10 = AbstractC31174DnI.A10(requiredCompactedEnumListField);
        Iterator<E> it = requiredCompactedEnumListField.iterator();
        while (it.hasNext()) {
            EnumC39600HeA enumC39600HeA = (EnumC39600HeA) it.next();
            if (enumC39600HeA != null) {
                int ordinal = enumC39600HeA.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 4) {
                        str = "OCULUS";
                    }
                } else {
                    str = "HORIZON";
                }
                A10.add(str);
            }
        }
        return A10;
    }

    public static final boolean A07(UserSession userSession, int i) {
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        if (i > ((int) C18U.A01(A0U, userSession, 36601178721095814L)) && C18U.A06(A0U, userSession, 36316645728326215L)) {
            return true;
        }
        return false;
    }
}
