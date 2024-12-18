package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.ui.widget.gallery.GalleryView;
import com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerGalleryTabFragment;
import java.util.Map;

/* renamed from: X.JiI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44325JiI implements InterfaceC23471Cj {
    public final int A00;
    public final Object A01;

    public C44325JiI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        C195838lR c195838lR;
        Activity requireActivity;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(map, 0);
                EnumC172127lh enumC172127lh = (EnumC172127lh) map.get("android.permission.WRITE_EXTERNAL_STORAGE");
                if (enumC172127lh == null || enumC172127lh.ordinal() != 0) {
                    return;
                }
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 1:
                ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) this.A01;
                if (map.get("android.permission.CAMERA") == EnumC172127lh.A05) {
                    ViewOnClickListenerC44269JhH.A02(viewOnClickListenerC44269JhH);
                    return;
                }
                c195838lR = viewOnClickListenerC44269JhH.A08;
                c195838lR.getClass();
                c195838lR.A06(map);
                return;
            case 2:
                C14360o3.A0B(map, 0);
                C43830JZt c43830JZt = (C43830JZt) this.A01;
                if (AbstractC93174Ft.A00(map) != EnumC172127lh.A05 && !AbstractC93174Ft.A03(c43830JZt.A08)) {
                    C43830JZt.A0U = true;
                    c43830JZt.A0F.A00(new C48602Lee(c43830JZt));
                    return;
                } else {
                    C43830JZt.A0U = false;
                    C43830JZt.A02(c43830JZt);
                    return;
                }
            case 3:
                if (map.get("android.permission.WRITE_EXTERNAL_STORAGE") == EnumC172127lh.A05) {
                    return;
                }
                c195838lR = ((C45513KDd) ((ViewOnClickListenerC48066LPr) this.A01).A01).A04;
                c195838lR.getClass();
                c195838lR.A06(map);
                return;
            case 4:
                if (map.get("android.permission.WRITE_EXTERNAL_STORAGE") == EnumC172127lh.A05) {
                    return;
                }
                C45490KCf c45490KCf = (C45490KCf) this.A01;
                C18240vB c18240vB = C45490KCf.A0O;
                c195838lR = c45490KCf.A08;
                if (c195838lR == null) {
                    return;
                }
                c195838lR.A06(map);
                return;
            case 5:
                EnumC172127lh enumC172127lh2 = (EnumC172127lh) map.get("android.permission.ACCESS_FINE_LOCATION");
                if (enumC172127lh2 == null) {
                    return;
                }
                int ordinal = enumC172127lh2.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        if (ordinal != 1) {
                            return;
                        }
                        C70684Wf5 c70684Wf5 = (C70684Wf5) this.A01;
                        C70684Wf5.A01(c70684Wf5.A08, c70684Wf5.A0H, c70684Wf5, "app_permission_deny");
                        return;
                    }
                    C70684Wf5 c70684Wf52 = (C70684Wf5) this.A01;
                    UserSession userSession = c70684Wf52.A0H;
                    Activity activity = c70684Wf52.A08;
                    C70684Wf5.A01(activity, userSession, c70684Wf52, "app_permission_deny");
                    if (c70684Wf52.A0Q) {
                        return;
                    }
                    C1VW c1vw = C1VW.A00;
                    if (c1vw != null && c1vw.shouldUseDevicePermissionKit(userSession, VDJ.A05) && c1vw.shouldUseNewNativeReconsiderDialog(userSession)) {
                        return;
                    }
                    String A0o = AbstractC166997dE.A0o();
                    V9E v9e = new V9E(A0o, this, 0);
                    C4I7 c4i7 = c70684Wf52.A03;
                    if (c4i7 != null) {
                        AbstractC68641VYw.A00.A03(userSession, c4i7, "DISCOVERY_MAP", A0o);
                    }
                    WGH.A05(activity, v9e);
                    return;
                }
                C70684Wf5 c70684Wf53 = (C70684Wf5) this.A01;
                C70684Wf5.A01(c70684Wf53.A08, c70684Wf53.A0H, c70684Wf53, "app_permission_grant");
                MediaMapFragment mediaMapFragment = c70684Wf53.A0K;
                if (mediaMapFragment.isResumed()) {
                    mediaMapFragment.A03.A01();
                }
                c70684Wf53.A07();
                c70684Wf53.A05();
                return;
            case 6:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 7:
                GalleryView galleryView = (GalleryView) this.A01;
                if (AbstractC93174Ft.A03(AbstractC166997dE.A0L(galleryView))) {
                    C195838lR c195838lR2 = galleryView.A0A;
                    if (c195838lR2 != null) {
                        c195838lR2.A00();
                    }
                    galleryView.A0A = null;
                    GalleryView.A04(galleryView);
                    galleryView.A0C();
                    InterfaceC16820sZ interfaceC16820sZ = galleryView.A0G;
                    if (interfaceC16820sZ == null) {
                        return;
                    }
                    interfaceC16820sZ.invoke();
                    return;
                }
                GalleryView.A05(galleryView);
                return;
            case 8:
                FundraiserPhotoPickerGalleryTabFragment fundraiserPhotoPickerGalleryTabFragment = (FundraiserPhotoPickerGalleryTabFragment) this.A01;
                if (AbstractC93174Ft.A00(map) == EnumC172127lh.A05) {
                    FundraiserPhotoPickerGalleryTabFragment.A00(fundraiserPhotoPickerGalleryTabFragment);
                    return;
                } else {
                    requireActivity = fundraiserPhotoPickerGalleryTabFragment.requireActivity();
                    WGH.A02(requireActivity, 2131974429);
                    return;
                }
            default:
                C62908SWp c62908SWp = (C62908SWp) this.A01;
                Context context = c62908SWp.A02;
                if (AbstractC93174Ft.A03(context)) {
                    C62908SWp.A00(c62908SWp);
                    return;
                } else {
                    requireActivity = (Activity) context;
                    WGH.A02(requireActivity, 2131974429);
                    return;
                }
        }
    }
}
