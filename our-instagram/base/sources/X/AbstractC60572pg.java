package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.2pg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60572pg {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final C1QP A00(Fragment fragment) {
        C1QP c1qp;
        String str = fragment.mTag;
        if (str != null) {
            switch (str.hashCode()) {
                case -1029787440:
                    if (str.equals("fragment_producer_profile_panel")) {
                        c1qp = EnumC54812ff.A08;
                        break;
                    }
                    break;
                case -869920652:
                    if (str.equals("fragment_clips")) {
                        c1qp = C1QO.A09;
                        break;
                    }
                    break;
                case -859263443:
                    if (str.equals("fragment_feed")) {
                        c1qp = C1QO.A0C;
                        break;
                    }
                    break;
                case -859024542:
                    if (str.equals("fragment_news")) {
                        c1qp = C1QO.A0D;
                        break;
                    }
                    break;
                case -855271120:
                    if (str.equals("fragment_share")) {
                        c1qp = C1QO.A0G;
                        break;
                    }
                    break;
                case -746371465:
                    if (str.equals("fragment_search")) {
                        c1qp = C1QO.A0F;
                        break;
                    }
                    break;
                case 354534074:
                    if (str.equals("fragment_profile")) {
                        c1qp = C1QO.A0E;
                        break;
                    }
                    break;
                case 812208100:
                    if (str.equals("fragment_clips_ad_cta_panel")) {
                        c1qp = EnumC54812ff.A06;
                        break;
                    }
                    break;
                case 1600254799:
                    if (str.equals("fragment_panel_camera")) {
                        c1qp = EnumC54812ff.A05;
                        break;
                    }
                    break;
                case 1636420627:
                    if (str.equals("fragment_panel_direct")) {
                        c1qp = EnumC54812ff.A07;
                        break;
                    }
                    break;
                case 1919233296:
                    if (str.equals("fragment_thread_view_panel")) {
                        c1qp = EnumC54812ff.A09;
                        break;
                    }
                    break;
                case 1926909838:
                    if (str.equals("fragment_direct_tab")) {
                        c1qp = C1QO.A0B;
                        break;
                    }
                    break;
            }
            return c1qp;
        }
        C0w9.A03("IgHostConstants", AnonymousClass001.A0g("Fragment [", fragment.getClass().getSimpleName(), "] Tag not covered by getHostByFragmentTag"));
        return null;
    }
}
