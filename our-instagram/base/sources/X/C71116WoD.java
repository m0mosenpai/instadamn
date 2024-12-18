package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.GraphGuardianContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WoD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71116WoD implements InterfaceC37231Gag {
    public final C33301Enw A00;

    public C71116WoD(C33301Enw c33301Enw) {
        C14360o3.A0B(c33301Enw, 1);
        this.A00 = c33301Enw;
    }

    @Override // X.InterfaceC37231Gag
    public final long Ajf() {
        return ((YFT) this.A00).A01.A01;
    }

    @Override // X.InterfaceC37231Gag
    public final InterfaceC37287Gbo B8k() {
        C2JS A02 = this.A00.A01.A02(C67495Umv.class, "friend_requests", 1195986619);
        if (A02 != null) {
            return (InterfaceC37287Gbo) A02.A01(C67599UsK.class, 839552330);
        }
        return null;
    }

    @Override // X.InterfaceC37231Gag
    public final List BAk() {
        return ((YFT) this.A00).A00.BAk();
    }

    @Override // X.InterfaceC37231Gag
    public final int BD5() {
        return this.A00.A01.getCoercedIntField(8, "hashtag_count");
    }

    @Override // X.InterfaceC37231Gag
    public final boolean BUw() {
        return this.A00.A01.getCoercedBooleanField(4, "more_groups_available");
    }

    @Override // X.InterfaceC37231Gag
    public final List BWm() {
        List CEC = ((YFT) this.A00).A00.CEC();
        if (CEC == null) {
            return C16930sl.A00;
        }
        return CEC;
    }

    @Override // X.InterfaceC37231Gag
    public final List Bfn() {
        ImmutableList optionalCompactedTreeListField = this.A00.A01.getOptionalCompactedTreeListField(9, "preview_hashtags", C67497Umx.class, -22302801);
        if (optionalCompactedTreeListField != null) {
            ArrayList A0q = AbstractC167017dG.A0q(optionalCompactedTreeListField);
            Iterator<E> it = optionalCompactedTreeListField.iterator();
            while (it.hasNext()) {
                A0q.add(((C2JS) it.next()).getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
            }
            return A0q;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC37231Gag
    public final boolean BvA() {
        return this.A00.A01.getCoercedBooleanField(7, "should_limit_list_of_followers");
    }

    @Override // X.InterfaceC37231Gag
    public final GraphGuardianContent Bz6() {
        return ((YFT) this.A00).A00.Bz6();
    }

    @Override // X.InterfaceC37231Gag
    public final List C3u() {
        List C3u = ((YFT) this.A00).A00.C3u();
        if (C3u == null) {
            return C16930sl.A00;
        }
        return C3u;
    }

    @Override // X.InterfaceC37231Gag
    public final boolean CDa() {
        return this.A00.A01.getCoercedBooleanField(13, "use_clickable_see_more");
    }

    @Override // X.InterfaceC37231Gag
    public final boolean CR4() {
        return this.A00.CR4();
    }

    @Override // X.InterfaceC37231Gag
    public final String getNextMaxId() {
        return this.A00.getNextMaxId();
    }
}
