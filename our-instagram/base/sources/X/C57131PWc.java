package X;

import com.instagram.settings2.core.session.SettingsSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.session.SettingsSession", f = "SettingsSession.kt", i = {0, 0, 0, 0}, l = {80}, m = "resolveUnsafe", n = {"this", "abstractValueResolver", "destination$iv$iv", "initialCacheSize"}, s = {"L$0", "L$3", "L$4", "I$1"})
/* renamed from: X.PWc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57131PWc extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public /* synthetic */ Object A0A;
    public final /* synthetic */ SettingsSession A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57131PWc(SettingsSession settingsSession, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0B = settingsSession;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A0A = obj;
        this.A02 |= Integer.MIN_VALUE;
        return this.A0B.A02(null, this);
    }
}
