package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1k3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34651k3 extends C1OW implements InterfaceC29171au {
    public static final C1OZ A08 = new C1OZ() { // from class: X.1k4
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34651k3 c34651k3 = (C34651k3) obj;
            anonymousClass182.A0d();
            c34651k3.A03();
            anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c34651k3.A03());
            anonymousClass182.A0Q("toggle_thread_mode_entry_point", c34651k3.A00);
            anonymousClass182.A0T(DatePickerDialogModule.ARG_MODE, c34651k3.A07);
            Integer num = c34651k3.A04;
            if (num != null) {
                anonymousClass182.A0Q("ttl_sec", num.intValue());
            }
            Integer num2 = c34651k3.A05;
            if (num2 != null) {
                anonymousClass182.A0Q("view_ttl_sec", num2.intValue());
            }
            if (c34651k3.A03 != null) {
                anonymousClass182.A0r("pre_mutation_disappearing_mode_metadata");
                AbstractC1118652y.A00(anonymousClass182, c34651k3.A03);
            }
            if (c34651k3.A02 != null) {
                anonymousClass182.A0r("optimistic_disappearing_mode_metadata");
                AbstractC1118652y.A00(anonymousClass182, c34651k3.A02);
            }
            AbstractC43669JTd.A00(anonymousClass182, c34651k3);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C34651k3 parseFromJson = F6U.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }
    };
    public int A00;
    public C81613kW A01;
    public C1118752z A02;
    public C1118752z A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34651k3(UserSession userSession, JTa jTa, Integer num, Integer num2, String str, int i, boolean z) {
        super(jTa);
        C1118752z c1118752z;
        C14360o3.A0B(jTa, 2);
        this.A00 = -1;
        this.A06 = str;
        this.A00 = i;
        this.A07 = z;
        this.A04 = num;
        this.A05 = num2;
        C2DS A00 = AbstractC28761aE.A00(userSession);
        C81663kb A0N = ((C2DU) A00).A0N(str);
        if (A0N != null) {
            c1118752z = A0N.Ay9();
        } else {
            c1118752z = null;
        }
        this.A03 = c1118752z;
        this.A01 = A0N != null ? A0N.Aic() : null;
        this.A02 = A00(userSession, this, A00);
    }

    @Override // X.C1OW
    public final String A02() {
        return "set_disappearing_messages_settings";
    }

    public final String A03() {
        String str = this.A06;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }

    public static final C1118752z A00(UserSession userSession, C34651k3 c34651k3, C2DS c2ds) {
        C1118752z c1118752z;
        Long l;
        Long l2;
        C81663kb B3U = c2ds.B3U(c34651k3.C7Q());
        Integer num = null;
        if (B3U != null) {
            c1118752z = B3U.Ay9();
        } else {
            c1118752z = null;
        }
        Long BX2 = c2ds.BX2(c34651k3.C7Q());
        if (BX2 != null) {
            l = Long.valueOf(TimeUnit.MICROSECONDS.toMillis(BX2.longValue()) + 1);
        } else {
            l = null;
        }
        boolean z = c34651k3.A07;
        Integer num2 = c34651k3.A04;
        Integer num3 = c34651k3.A05;
        String str = userSession.userId;
        Integer num4 = num2;
        if (num2 == null) {
            if (c1118752z != null) {
                num4 = c1118752z.A02;
            } else {
                num4 = null;
            }
        }
        if (num3 == null) {
            if (c1118752z != null) {
                num = c1118752z.A03;
            }
        } else {
            num = num3;
        }
        Long l3 = l;
        if (c1118752z == null || (l2 = c1118752z.A04) == null) {
            if (num2 == null || num2.intValue() <= 0 || B3U == null || !C6X6.A0O(userSession, B3U)) {
                l3 = null;
            }
            l2 = l3;
        }
        return new C1118752z(num2, num4, num3, num, l, l2, str, z);
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return new DirectThreadKey(A03());
    }

    public C34651k3() {
        super(null, null, 1);
        this.A00 = -1;
    }
}
