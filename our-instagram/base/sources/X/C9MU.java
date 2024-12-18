package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.9MU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9MU implements InterfaceC196038lt {
    public final UserSession A00;
    public final InterfaceC09390do A01;

    public C9MU(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37050GUg(this, 4));
    }

    public static final boolean A00(EnumC128745rh enumC128745rh, C9MA c9ma) {
        ImmutableList immutableList;
        C2JS A03;
        if (c9ma != null && (A03 = c9ma.A03(C9MB.class, "xcxp_bpl_auto_crosspost_settings_root(configs_request:$configs_request)", -1047456758)) != null) {
            immutableList = A03.A06(C9PM.class, "auto_xpost_setting", 304935101);
        } else {
            immutableList = null;
        }
        if (immutableList != null && (!(immutableList instanceof Collection) || !immutableList.isEmpty())) {
            Iterator<E> it = immutableList.iterator();
            while (it.hasNext()) {
                C2JS c2js = (C2JS) it.next();
                if (c2js.getOptionalEnumField(0, "source_surface", EnumC128745rh.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == enumC128745rh && c2js.getCoercedBooleanField(1, "is_auto_crosspost_enabled")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC196038lt
    public final boolean B5Z() {
        return ((C46552Bt) this.A01.getValue()).A04.getBoolean("PREFERENCE_CREATOR_FEED_BPL_AUTO_XPOSTING", false);
    }

    @Override // X.InterfaceC196038lt
    public final boolean Blx() {
        return ((C46552Bt) this.A01.getValue()).A04.getBoolean("PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING", false);
    }

    @Override // X.InterfaceC196038lt
    public final boolean C1B() {
        return ((C46552Bt) this.A01.getValue()).A04.getBoolean("PREFERENCE_CREATOR_STORY_BPL_AUTO_XPOSTING", false);
    }

    @Override // X.InterfaceC196038lt
    public final void ECq(final InterfaceC196248mG interfaceC196248mG) {
        C2JO c2jo = new C2JO();
        ImmutableList.Builder builder = ImmutableList.builder();
        C2JO c2jo2 = new C2JO();
        c2jo2.A09("FB", "destination_app");
        c2jo2.A09("STORY", "destination_surface");
        c2jo2.A09("STORY", "source_surface");
        builder.add((Object) c2jo2);
        C2JO c2jo3 = new C2JO();
        c2jo3.A09("FB", "destination_app");
        c2jo3.A09("FEED", "destination_surface");
        c2jo3.A09("FEED", "source_surface");
        builder.add((Object) c2jo3);
        C2JO c2jo4 = new C2JO();
        c2jo4.A09("FB", "destination_app");
        c2jo4.A09("REELS", "destination_surface");
        c2jo4.A09("REELS", "source_surface");
        builder.add((Object) c2jo4);
        c2jo.A05("crosspost_app_surface_list", builder.build());
        c2jo.A09("IG", "source_app");
        MY8.A00(c2jo, this.A00, new InterfaceC58074Poz() { // from class: X.9OJ
            @Override // X.InterfaceC58074Poz
            public final void DFf() {
                interfaceC196248mG.DG4("FbBPLCrossPostingSettingDataProvider - Fetch failed");
            }

            @Override // X.InterfaceC58074Poz
            public final void Dq4(C9MA c9ma) {
                C9MU c9mu = C9MU.this;
                boolean A00 = C9MU.A00(EnumC128745rh.FEED, c9ma);
                InterfaceC09390do interfaceC09390do = c9mu.A01;
                InterfaceC19610xo ARD = ((C46552Bt) interfaceC09390do.getValue()).A04.ARD();
                ARD.E77("PREFERENCE_CREATOR_FEED_BPL_AUTO_XPOSTING", A00);
                ARD.apply();
                boolean A002 = C9MU.A00(EnumC128745rh.STORY, c9ma);
                InterfaceC19610xo ARD2 = ((C46552Bt) interfaceC09390do.getValue()).A04.ARD();
                ARD2.E77("PREFERENCE_CREATOR_STORY_BPL_AUTO_XPOSTING", A002);
                ARD2.apply();
                ((C46552Bt) interfaceC09390do.getValue()).A06(C9MU.A00(EnumC128745rh.REELS, c9ma));
            }
        });
    }

    @Override // X.InterfaceC196038lt
    public final String getIdentifier() {
        return "BPLDataProvider";
    }
}
