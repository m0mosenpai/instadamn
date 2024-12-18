package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.List;

/* loaded from: classes4.dex */
public final class ALm {
    public static final ALm A00 = new Object();

    public static final void A00(InterfaceC02550Ad interfaceC02550Ad, EnumC53340Niq enumC53340Niq, EnumC223329tP enumC223329tP, C41181vS c41181vS, C84823qW c84823qW, List list) {
        int i;
        C41743IeH c41743IeH;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) interfaceC02550Ad, "ig_wellbeing_anti_bullying_stickers");
        A0f.A8R(enumC53340Niq, "action");
        A0f.A8R(enumC223329tP, OptSvcAnalyticsStore.LOGGING_KEY_STEP);
        A0f.A9K(AbstractC43591JPw.A00(1341), Long.valueOf(i));
        if (c84823qW != null) {
            int ordinal = c84823qW.A12.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 51) {
                        if (ordinal == 4) {
                            c41743IeH = c84823qW.A1G;
                        }
                    } else {
                        c41743IeH = c84823qW.A1H;
                    }
                } else {
                    c41743IeH = c84823qW.A1E;
                }
            } else {
                c41743IeH = c84823qW.A1D;
            }
            if (c41743IeH != null) {
                A0f.AAP("sticker_id_str", c41743IeH.A09);
            }
        }
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            A0f.AAP("media_id_str", c38321qM.getId());
        }
        A0f.Cht();
    }

    public static final void A01(InterfaceC02550Ad interfaceC02550Ad, C41181vS c41181vS, List list) {
        A00(interfaceC02550Ad, EnumC53340Niq.IMPRESSION, EnumC223329tP.CONSUMER_STICKER, c41181vS, (C84823qW) AbstractC001800i.A0J(list), list);
    }
}
