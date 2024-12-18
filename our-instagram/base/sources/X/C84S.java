package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.84S, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84S {
    public final Context A00;
    public final UserSession A01;
    public final ClipsAudioStore A02;
    public final C84G A03;
    public final InterfaceC19390xP A04;
    public final InterfaceC06180Ui A05;
    public final C0UO A06;
    public final C0UO A07;
    public final InterfaceC19390xP A08;
    public final InterfaceC19390xP A09;
    public final C0UO A0A;
    public final C0UO A0B;
    public final C0UO A0C;
    public final C0UO A0D;
    public final C0UO A0E;
    public final C0UO A0F;
    public final C0UO A0G;
    public final C0UO A0H;

    public C84S(Context context, UserSession userSession, ClipsAudioStore clipsAudioStore, C84G c84g, C49602Pt c49602Pt, C19L c19l) {
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = c84g;
        this.A02 = clipsAudioStore;
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A05 = A00;
        C013404z A04 = AnonymousClass111.A04(A00, c84g.A03);
        C0UO c0uo = clipsAudioStore.A0a;
        C0UO c0uo2 = clipsAudioStore.A0c;
        this.A04 = C10Q.A00(C84T.A00, A04, c0uo, c0uo2);
        C0UO c0uo3 = clipsAudioStore.A0V;
        C007802s A02 = AnonymousClass111.A02(new C9DF(this, (InterfaceC23621Ds) null, 8), new C15430py(c0uo3));
        this.A08 = A02;
        C007802s A022 = AnonymousClass111.A02(new C9DF(this, (InterfaceC23621Ds) null, 11), new C15430py(c0uo3));
        C10H c10h = C10I.A01;
        C193588hd c193588hd = C193588hd.A00;
        AnonymousClass059 A01 = AbstractC208910l.A01(c193588hd, c19l, A022, c10h);
        this.A09 = A01;
        C0UO c0uo4 = clipsAudioStore.A0l;
        C0UO c0uo5 = clipsAudioStore.A0n;
        C0UO c0uo6 = clipsAudioStore.A0m;
        AnonymousClass059 A012 = AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C9DF(this, (InterfaceC23621Ds) null, 9), C10Q.A00(C84V.A00, c0uo4, c0uo5, c0uo6)), c10h);
        this.A0G = A012;
        AnonymousClass059 A013 = AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C9DF(this, (InterfaceC23621Ds) null, 10), C10Q.A03(C84W.A00, c0uo4, c0uo6)), c10h);
        this.A0H = A013;
        AnonymousClass059 A014 = AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C9D5(5, null), clipsAudioStore.A0j), c10h);
        this.A0F = A014;
        AnonymousClass059 A015 = AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C9D5(4, null), clipsAudioStore.A0h), c10h);
        this.A0D = A015;
        C0UO c0uo7 = clipsAudioStore.A0f;
        AnonymousClass059 A016 = AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C9D5(3, null), c0uo7), c10h);
        this.A0C = A016;
        AnonymousClass059 A017 = AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C9DN(this, c49602Pt, null, 4), c0uo7), c10h);
        this.A0E = A017;
        AnonymousClass059 A018 = AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C9D5(2, null), C10Q.A03(C84X.A00, A017, clipsAudioStore.A0g)), c10h);
        this.A0B = A018;
        final InterfaceC19390xP[] interfaceC19390xPArr = (InterfaceC19390xP[]) AbstractC001800i.A0a(AbstractC16960so.A1Q(A01, A012, A014, A015, AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C50541MSu(2, null), A018), c10h))).toArray(new InterfaceC19390xP[0]);
        AnonymousClass059 A019 = AbstractC208910l.A01(c193588hd, c19l, new InterfaceC19390xP(this) { // from class: X.84Y
            public final /* synthetic */ C84S A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                InterfaceC19390xP[] interfaceC19390xPArr2 = interfaceC19390xPArr;
                Object A002 = AnonymousClass104.A00(interfaceC23621Ds, new C9ES(interfaceC19390xPArr2, 34), new C9DF(this.A00, (InterfaceC23621Ds) null, 7), interfaceC19960yQ, interfaceC19390xPArr2);
                if (A002 != C1JX.A02) {
                    return C0eB.A00;
                }
                return A002;
            }
        }, c10h);
        this.A0A = A019;
        final InterfaceC19390xP[] interfaceC19390xPArr2 = (InterfaceC19390xP[]) AbstractC001800i.A0a(AbstractC16960so.A1Q(A02, A013, A014, A015, A016)).toArray(new InterfaceC19390xP[0]);
        this.A07 = AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C9D5(1, null), new InterfaceC19390xP(this) { // from class: X.84Z
            public final /* synthetic */ C84S A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                InterfaceC19390xP[] interfaceC19390xPArr3 = interfaceC19390xPArr2;
                Object A002 = AnonymousClass104.A00(interfaceC23621Ds, new B5y(interfaceC19390xPArr3, 4), new MU8(this.A00, (InterfaceC23621Ds) null, 11), interfaceC19960yQ, interfaceC19390xPArr3);
                if (A002 != C1JX.A02) {
                    return C0eB.A00;
                }
                return A002;
            }
        }), c10h);
        this.A06 = AbstractC208910l.A01(c193588hd, c19l, AnonymousClass111.A02(new C9DF(this, (InterfaceC23621Ds) null, 6), C10Q.A00(C1816884a.A00, A019, c0uo2, clipsAudioStore.A0k)), c10h);
    }

    public static final AbstractC193598he A00(AbstractC193598he[] abstractC193598heArr) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC193598he abstractC193598he : abstractC193598heArr) {
            if (abstractC193598he instanceof C193648hk) {
                return C193648hk.A00;
            }
            if (abstractC193598he instanceof C8ZT) {
                arrayList.addAll((Collection) abstractC193598he.A00());
            }
        }
        return new C8ZT(arrayList);
    }

    public static final C5JH A01(C84S c84s, EnumC192868gS enumC192868gS, C24239Ap6 c24239Ap6, float f) {
        MediaEffect mediaEffect;
        String str = c24239Ap6.A06;
        if (str == null) {
            return null;
        }
        int i = c24239Ap6.A05;
        int i2 = c24239Ap6.A03;
        int i3 = c24239Ap6.A02 - i2;
        C5JI c5ji = C5JI.A0A;
        if (enumC192868gS != null) {
            Context context = c84s.A00;
            mediaEffect = enumC192868gS.A00;
            if (mediaEffect == null) {
                mediaEffect = AbstractC226929zo.A00(context, enumC192868gS.A05);
                enumC192868gS.A00 = mediaEffect;
            }
        } else {
            mediaEffect = null;
        }
        return new C5JH(mediaEffect, c5ji, null, str, null, null, f, 1.0f, i, i2, i3);
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.9nP, java.lang.Object, X.5Ks] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, X.5Ks, X.9nQ] */
    public final C115595Kt A02() {
        C47v c47v;
        AbstractC193598he abstractC193598he = (AbstractC193598he) this.A06.getValue();
        if (abstractC193598he instanceof C8ZT) {
            c47v = (C47v) abstractC193598he.A00();
        } else {
            c47v = new C47v(((Number) this.A02.A0k.getValue()).floatValue(), 30);
        }
        ArrayList A05 = ((C84B) this.A03.A03.getValue()).A05();
        ClipsAudioStore clipsAudioStore = this.A02;
        Map map = (Map) clipsAudioStore.A0a.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() instanceof C115475Kh) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC16850sd.A0L(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            C14360o3.A0C(key, MSV.A00(1443));
            linkedHashMap2.put(key, entry2.getValue());
        }
        C01L A1I = C0eM.A1I();
        EnumC192868gS enumC192868gS = (EnumC192868gS) clipsAudioStore.A0c.getValue();
        if (enumC192868gS != null) {
            Integer num = C05F.A00;
            ?? obj = new Object();
            obj.A00 = num;
            obj.A00 = enumC192868gS;
            A1I.add(obj);
        }
        C190178bb c190178bb = (C190178bb) clipsAudioStore.A0b.getValue();
        if (c190178bb != null) {
            Integer num2 = C05F.A01;
            ?? obj2 = new Object();
            obj2.A00 = num2;
            obj2.A00 = c190178bb;
            A1I.add(obj2);
        }
        Collection collection = (Collection) clipsAudioStore.A0X.getValue();
        if (collection != null) {
            A1I.addAll(collection);
        }
        return A1S.A00(c47v, A05, C0eM.A1J(A1I), linkedHashMap2);
    }
}
