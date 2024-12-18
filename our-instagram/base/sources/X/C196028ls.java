package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196028ls implements InterfaceC196038lt {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public C196028ls(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C206959Ea(this, 36));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C206959Ea(this, 35));
    }

    public static final C128735rg A00(EnumC128745rh enumC128745rh, C128705rd c128705rd) {
        ImmutableList requiredCompactedTreeListField;
        Object obj = null;
        if (c128705rd == null || (requiredCompactedTreeListField = c128705rd.getRequiredCompactedTreeListField(0, "crosspost_settings", C128715re.class, -2037360975)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(requiredCompactedTreeListField, 10));
        Iterator<E> it = requiredCompactedTreeListField.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2JS) it.next()).reinterpretRequired(0, C128735rg.class, -986182339));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((C2JS) next).getOptionalEnumField(0, "source_surface", EnumC128745rh.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == enumC128745rh) {
                obj = next;
                break;
            }
        }
        return (C128735rg) obj;
    }

    @Override // X.InterfaceC196038lt
    public final boolean B5Z() {
        return ((C23031Ai) this.A02.getValue()).A01.getBoolean("auto_cross_post_to_facebook_feed", false);
    }

    @Override // X.InterfaceC196038lt
    public final boolean Blx() {
        return ((C46552Bt) this.A01.getValue()).A04.getBoolean("PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED", false);
    }

    @Override // X.InterfaceC196038lt
    public final boolean C1B() {
        C23031Ai c23031Ai = (C23031Ai) this.A02.getValue();
        return ((Boolean) c23031Ai.A1B.CES(c23031Ai, C23031Ai.A8c[132])).booleanValue();
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
        AbstractC196298mL.A00(c2jo, this.A00, new InterfaceC196288mK() { // from class: X.8mJ
            @Override // X.InterfaceC196288mK
            public final void DFf() {
                interfaceC196248mG.DG4("FbUnifiedConfigCrossPostingSettingDataProvider - Fetch failed");
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
            
                if (r4.getCoercedBooleanField(1, "is_auto_crosspost_enabled") != true) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
            
                if (r5.getCoercedBooleanField(1, "is_auto_crosspost_enabled") != true) goto L28;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC196288mK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Dq2(X.C196308mM r10) {
                /*
                    Method dump skipped, instructions count: 288
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C196278mJ.Dq2(X.8mM):void");
            }
        });
    }

    @Override // X.InterfaceC196038lt
    public final String getIdentifier() {
        return "UnifiedConfigDataProvider";
    }
}
