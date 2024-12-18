package X;

import android.app.Activity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.WlD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70966WlD implements MQC {
    public final int A00;
    public final Object A01;

    public C70966WlD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.MQC
    public final void DYD(EnumC172127lh enumC172127lh) {
        String str;
        switch (this.A00) {
            case 0:
                if (enumC172127lh != EnumC172127lh.A05) {
                    return;
                }
                C67876V0h c67876V0h = (C67876V0h) this.A01;
                C67876V0h.A04(c67876V0h, true);
                IgdsSwitch igdsSwitch = c67876V0h.A09;
                if (igdsSwitch == null) {
                    str = "useCurrentLocationSwitch";
                } else {
                    PromoteData promoteData = c67876V0h.A05;
                    if (promoteData == null) {
                        str = "promoteData";
                    } else {
                        igdsSwitch.setChecked(promoteData.A0o.A00());
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                int ordinal = enumC172127lh.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        return;
                    }
                    C70684Wf5 c70684Wf5 = (C70684Wf5) this.A01;
                    if (c70684Wf5.A0Q) {
                        return;
                    }
                    C1VW c1vw = C1VW.A00;
                    if (c1vw != null) {
                        UserSession userSession = c70684Wf5.A0H;
                        if (c1vw.shouldUseDevicePermissionKit(userSession, VDJ.A05) && c1vw.shouldUseNewNativeReconsiderDialog(userSession)) {
                            return;
                        }
                    }
                    Activity activity = c70684Wf5.A08;
                    UserSession userSession2 = c70684Wf5.A0H;
                    C4I7 A00 = C70684Wf5.A00(activity, userSession2, c70684Wf5);
                    String obj = C0HM.A00().toString();
                    V9F v9f = new V9F(this, A00, obj, 0);
                    AbstractC68641VYw.A00.A03(userSession2, A00, "DISCOVERY_MAP", obj);
                    WGH.A05(activity, v9f);
                    return;
                }
                C70684Wf5 c70684Wf52 = (C70684Wf5) this.A01;
                MediaMapFragment mediaMapFragment = c70684Wf52.A0K;
                if (mediaMapFragment.isResumed()) {
                    mediaMapFragment.A03.A01();
                }
                c70684Wf52.A07();
                c70684Wf52.A05();
                return;
            case 2:
                ((InterfaceC16820sZ) this.A01).invoke();
                return;
            default:
                int ordinal2 = enumC172127lh.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 2) {
                        WlL wlL = (WlL) this.A01;
                        if (!wlL.A06) {
                            C1VW c1vw2 = C1VW.A00;
                            if (c1vw2 != null) {
                                UserSession userSession3 = wlL.A03;
                                if (c1vw2.shouldUseDevicePermissionKit(userSession3, VDJ.A0U) && c1vw2.shouldUseNewNativeReconsiderDialog(userSession3)) {
                                    return;
                                }
                            }
                            String obj2 = C0HM.A00().toString();
                            UserSession userSession4 = wlL.A03;
                            C4I7 c4i7 = new C4I7(new C70678Wey(this), userSession4);
                            V9F v9f2 = new V9F(this, c4i7, obj2, 1);
                            AbstractC68641VYw.A00.A03(userSession4, c4i7, "STORY_ARCHIVE_MAP", obj2);
                            WGH.A05(wlL.A01, v9f2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                WlL.A00((WlL) this.A01);
                return;
        }
    }

    @Override // X.MQC
    public final boolean EjC() {
        return true;
    }
}
