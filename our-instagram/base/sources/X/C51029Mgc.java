package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.facebook.rp.platform.metaai.rsys.voicestate.LLMResponse;
import java.util.ArrayDeque;

/* renamed from: X.Mgc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51029Mgc extends AbstractC52922bZ {
    public MetaAiRsysSdkRealTimeSession A00;
    public LLMResponse A01;
    public AnonymousClass195 A02;
    public final C55004OVk A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC19390xP A06;
    public final InterfaceC19390xP A07;
    public final InterfaceC06180Ui A08;
    public final InterfaceC06180Ui A09;
    public final C05A A0A;
    public final C0UO A0B;
    public final C12W A0C;

    public C51029Mgc(C55004OVk c55004OVk, C12W c12w, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        AbstractC25233BEq.A0w(2, c12w, interfaceC16820sZ, interfaceC16820sZ2);
        this.A03 = c55004OVk;
        this.A0C = c12w;
        this.A04 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        C008002u A1H = AbstractC25225BEi.A1H(new C55091Ob2(null, EnumC53181Nfd.A03, null, null, C05F.A01, null, null, false, false, false, false, true, false));
        this.A0A = A1H;
        this.A0B = A1H;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A09 = A00;
        this.A07 = A00;
        AnonymousClass057 A002 = C10M.A00(num, 0, 0);
        this.A08 = A002;
        this.A06 = A002;
    }

    public final void A01() {
        Object value;
        EnumC53181Nfd enumC53181Nfd;
        Integer num;
        CharSequence charSequence;
        boolean z;
        boolean z2;
        boolean z3;
        android.net.Uri uri;
        boolean z4;
        this.A01 = null;
        C05A c05a = this.A0A;
        do {
            value = c05a.getValue();
            C55091Ob2 c55091Ob2 = (C55091Ob2) value;
            enumC53181Nfd = EnumC53181Nfd.A04;
            num = C05F.A01;
            charSequence = c55091Ob2.A03;
            z = c55091Ob2.A0A;
            z2 = c55091Ob2.A08;
            z3 = c55091Ob2.A0B;
            uri = c55091Ob2.A00;
            z4 = c55091Ob2.A09;
            AbstractC25229BEm.A1J(enumC53181Nfd, 3, num);
        } while (!c05a.AIi(value, new C55091Ob2(uri, enumC53181Nfd, null, charSequence, num, null, null, false, z, z2, false, z3, z4)));
        AnonymousClass195 anonymousClass195 = this.A02;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A02 = null;
        if (this.A00 != null) {
            D51.A02(this, C2SW.A00, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        if (r48 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        r12 = r10.getValue();
        r0 = (X.C55091Ob2) r12;
        r14 = r0.A05;
        r13 = r0.A06;
        r9 = r0.A03;
        r8 = r0.A01;
        r7 = r0.A0C;
        r6 = r0.A07;
        r5 = r0.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00be, code lost:
    
        if (r10.AIi(r12, new X.C55091Ob2(r0.A00, r8, r0.A02, r9, r0.A04, r14, r13, r7, false, false, r6, r5, r0.A09)) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c0, code lost:
    
        r39.A02 = X.AbstractC23641Du.A04(r39.A0C, new com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4(r40, r41, r39, r43, r42, null, r44, r45, r47, r48), X.AbstractC141776au.A00(r39));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.content.Context r40, X.C07X r41, java.lang.String r42, java.lang.String r43, X.InterfaceC16660sJ r44, long r45, boolean r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51029Mgc.A02(android.content.Context, X.07X, java.lang.String, java.lang.String, X.0sJ, long, boolean, boolean):void");
    }

    public final void A03(Context context, C07X c07x, InterfaceC16660sJ interfaceC16660sJ, long j) {
        Object value;
        C55091Ob2 c55091Ob2;
        SpannableString A00;
        String str;
        String str2;
        EnumC53181Nfd enumC53181Nfd;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C05A c05a = this.A0A;
        do {
            value = c05a.getValue();
            c55091Ob2 = (C55091Ob2) value;
            A00 = A00(context, c07x, this, interfaceC16660sJ, j, false);
            str = c55091Ob2.A05;
            str2 = c55091Ob2.A06;
            enumC53181Nfd = c55091Ob2.A01;
            z = c55091Ob2.A0C;
            z2 = c55091Ob2.A0A;
            z3 = c55091Ob2.A08;
            z4 = c55091Ob2.A07;
            z5 = c55091Ob2.A0B;
        } while (!c05a.AIi(value, new C55091Ob2(c55091Ob2.A00, enumC53181Nfd, c55091Ob2.A02, A00, c55091Ob2.A04, str, str2, z, z2, z3, z4, z5, c55091Ob2.A09)));
    }

    public static final SpannableString A00(Context context, C07X c07x, C51029Mgc c51029Mgc, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
        context.getResources();
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        ArrayDeque arrayDeque = new ArrayDeque();
        A01.append((CharSequence) context.getString(2131956637));
        A01.append((CharSequence) " ");
        arrayDeque.addFirst(new C54576O9d(A01.length(), 33, new C50769Mba(context, c07x, c51029Mgc, interfaceC16660sJ, j, z)));
        A01.append((CharSequence) context.getString(2131956636));
        C18C.A0F(AbstractC25226BEj.A1b(arrayDeque));
        C54576O9d c54576O9d = (C54576O9d) arrayDeque.removeFirst();
        A01.setSpan(c54576O9d.A02, c54576O9d.A01, A01.length(), c54576O9d.A00);
        return new SpannableString(A01);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        A01();
    }
}
