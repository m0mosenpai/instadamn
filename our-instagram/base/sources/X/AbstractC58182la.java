package X;

import com.facebook.R;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$displayStyle$3;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$filterCombine$$inlined$map$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$shouldShowBadge$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filter$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filter$2$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filterCombine$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filterCombine$2$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$1$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$2$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$3$2;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$map$4$2;
import java.util.List;
import java.util.Map;

/* renamed from: X.2la, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC58182la {
    public C9BT A00;
    public C54432ex A01;
    public AnonymousClass195 A02;
    public final int A03;
    public final int A04;
    public final C2GT A05;
    public final C2GT A06;
    public final C2GT A07;
    public final C2GT A08;
    public final EnumC58122lU A09;
    public final EnumC58122lU A0A;
    public final EnumC58122lU A0B;
    public final EnumC58122lU A0C;
    public final InterfaceC54232eZ A0D;
    public final C54672fP A0E;
    public final Map A0F;
    public final InterfaceC16820sZ A0G;
    public final C05A A0H;
    public final C05A A0I;
    public final C05A A0J;
    public final boolean A0K;
    public final InterfaceC19390xP A0L;

    public final void A02(boolean z) {
        EnumC58122lU enumC58122lU;
        C58172lZ c58172lZ = (C58172lZ) this;
        if (!((Boolean) c58172lZ.A0I.getValue()).booleanValue() || c58172lZ.A03 || z) {
            if (((EnumC58212ld) c58172lZ.A0H.getValue()).ordinal() == 1) {
                enumC58122lU = EnumC58122lU.A08;
            } else {
                enumC58122lU = EnumC58122lU.A03;
            }
            C54432ex c54432ex = ((AbstractC58182la) c58172lZ).A01;
            if (c54432ex != null) {
                C54392et c54392et = c58172lZ.A00;
                EnumC58162lY enumC58162lY = c58172lZ.A02;
                c54392et.A05(enumC58122lU, enumC58162lY, c54432ex, null);
                C54412ev c54412ev = c58172lZ.A01;
                C14360o3.A0B(enumC58162lY, 0);
                c54412ev.A03(new C72053Ld(enumC58122lU, enumC58162lY, null, null), c54432ex, false);
            }
        }
    }

    public abstract void A03();

    public final void A01(EnumC58212ld enumC58212ld) {
        InterfaceC54232eZ interfaceC54232eZ;
        this.A0H.Egh(enumC58212ld);
        C54432ex c54432ex = this.A01;
        if (c54432ex != null && (interfaceC54232eZ = c54432ex.A03) != null) {
            C54672fP c54672fP = this.A0E;
            c54672fP.A00.put(interfaceC54232eZ, enumC58212ld);
            if (this.A0K && enumC58212ld == EnumC58212ld.A04) {
                C9BT c9bt = this.A00;
                int i = c9bt.A01;
                List list = (List) c9bt.A02;
                boolean z = c9bt.A03;
                C14360o3.A0B(list, 1);
                C9BT c9bt2 = new C9BT(list, i, z, true);
                c54672fP.A01.put(this.A0D, c9bt2);
                this.A00 = c9bt2;
            }
        }
    }

    public AbstractC58182la(EnumC58122lU enumC58122lU, EnumC58122lU enumC58122lU2, EnumC58122lU enumC58122lU3, EnumC58122lU enumC58122lU4, InterfaceC54232eZ interfaceC54232eZ, C54672fP c54672fP, InterfaceC16820sZ interfaceC16820sZ, C19L c19l, InterfaceC19390xP interfaceC19390xP, int i, int i2, boolean z, final boolean z2, boolean z3) {
        C9BT c9bt;
        this.A09 = enumC58122lU;
        this.A0A = enumC58122lU2;
        this.A0C = enumC58122lU3;
        this.A0B = enumC58122lU4;
        this.A03 = i;
        this.A0D = interfaceC54232eZ;
        this.A0E = c54672fP;
        this.A04 = i2;
        this.A0G = interfaceC16820sZ;
        this.A0K = z3;
        C09530e4 c09530e4 = new C09530e4(EnumC54222eY.A0G, Integer.valueOf(R.drawable.notification_comment_icon));
        C09530e4 c09530e42 = new C09530e4(EnumC54222eY.A0T, Integer.valueOf(R.drawable.notification_like_icon));
        C09530e4 c09530e43 = new C09530e4(EnumC54222eY.A0f, Integer.valueOf(R.drawable.notification_people_icon));
        C09530e4 c09530e44 = new C09530e4(EnumC54222eY.A0i, Integer.valueOf(R.drawable.notification_story_mention_icon));
        EnumC54222eY enumC54222eY = EnumC54222eY.A0o;
        Integer valueOf = Integer.valueOf(R.drawable.notification_tag_icon);
        this.A0F = AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, c09530e44, new C09530e4(enumC54222eY, valueOf), new C09530e4(EnumC54222eY.A0D, valueOf), new C09530e4(EnumC54222eY.A0A, Integer.valueOf(R.drawable.instagram_alert_filled_16)), new C09530e4(EnumC54222eY.A0h, Integer.valueOf(R.drawable.instagram_shopping_bag_filled_16)), new C09530e4(EnumC54222eY.A0O, Integer.valueOf(R.drawable.instagram_donations_filled_16)), new C09530e4(EnumC54222eY.A0d, Integer.valueOf(R.drawable.instagram_ads_pano_filled_16)), new C09530e4(EnumC54222eY.A0W, Integer.valueOf(R.drawable.instagram_carousel_pano_filled_16)));
        C008002u c008002u = new C008002u(false);
        this.A0J = c008002u;
        C008002u c008002u2 = new C008002u(false);
        this.A0I = c008002u2;
        Object obj = c54672fP.A00.get(interfaceC54232eZ);
        this.A0H = new C008002u(obj == null ? EnumC58212ld.A03 : obj);
        C9BT c9bt2 = (C9BT) c54672fP.A01.get(interfaceC54232eZ);
        if (c9bt2 != null) {
            int i3 = c9bt2.A01;
            List list = (List) c9bt2.A02;
            boolean z4 = c9bt2.A03;
            boolean z5 = c9bt2.A04;
            C14360o3.A0B(list, 1);
            c9bt = new C9BT(list, i3, z4, z5);
        } else {
            c9bt = new C9BT((List) C16930sl.A00, 0, 12, false);
        }
        this.A00 = c9bt;
        final C15340po c15340po = new C15340po(new C9D0(this, null, 49), interfaceC19390xP);
        this.A0L = c15340po;
        this.A05 = AbstractC58232lf.A00(c19l.Arv(), new InterfaceC19390xP(this) { // from class: X.2le
            public final /* synthetic */ AbstractC58182la A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = c15340po.collect(new BaseBadgeViewModel$special$$inlined$map$1$2(this.A00, interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        });
        this.A07 = AbstractC58232lf.A00(c19l.Arv(), C10Q.A03(new C206679Cy(1, null), C10Q.A03(new BaseBadgeViewModel$shouldShowBadge$2(null, z), new InterfaceC19390xP() { // from class: X.2lk
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new BaseBadgeViewModel$special$$inlined$map$2$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }, c008002u2), this.A0H));
        final C15150pV A03 = C10Q.A03(new C9D2(5, null), new C15340po(new C206629Ct(this, null, 36), new InterfaceC19390xP(this) { // from class: X.2lm
            public final /* synthetic */ AbstractC58182la A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = c15340po.collect(new BaseBadgeViewModel$special$$inlined$map$3$2(this.A00, interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }), c008002u);
        final InterfaceC19390xP interfaceC19390xP2 = new InterfaceC19390xP() { // from class: X.2ln
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new BaseBadgeViewModel$special$$inlined$filterCombine$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
        final C15150pV A032 = C10Q.A03(new C9D2(5, null), new InterfaceC19390xP() { // from class: X.2lo
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new BaseBadgeViewModel$filterCombine$$inlined$map$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }, c008002u2);
        final InterfaceC19390xP interfaceC19390xP3 = new InterfaceC19390xP() { // from class: X.2lp
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new BaseBadgeViewModel$special$$inlined$filterCombine$2$2(interfaceC19960yQ, z2), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
        final C15340po c15340po2 = new C15340po(new C9D4(c19l, this, (InterfaceC23621Ds) null, 16), AbstractC011604e.A00(C05F.A00, new InterfaceC19390xP() { // from class: X.2lo
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new BaseBadgeViewModel$filterCombine$$inlined$map$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }, -1));
        this.A08 = AbstractC58232lf.A00(c19l.Arv(), new C15340po(new C9D1(this, null, 0), new InterfaceC19390xP(this) { // from class: X.2lq
            public final /* synthetic */ AbstractC58182la A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = c15340po2.collect(new BaseBadgeViewModel$special$$inlined$filter$1$2(this.A00, interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }));
        final C05A c05a = this.A0H;
        final InterfaceC19390xP interfaceC19390xP4 = new InterfaceC19390xP() { // from class: X.2lr
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new BaseBadgeViewModel$special$$inlined$filter$2$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
        this.A06 = AbstractC58232lf.A00(c19l.Arv(), C10Q.A03(new BaseBadgeViewModel$displayStyle$3(this, null), new InterfaceC19390xP(this) { // from class: X.2ls
            public final /* synthetic */ AbstractC58182la A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = interfaceC19390xP4.collect(new BaseBadgeViewModel$special$$inlined$map$4$2(this.A00, interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }, c008002u2));
    }
}
