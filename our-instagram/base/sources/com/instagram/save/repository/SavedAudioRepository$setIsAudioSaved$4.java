package com.instagram.save.repository;

import X.AbstractC23611Dp;
import X.AbstractC53525Nlr;
import X.C0eB;
import X.C52678NSa;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC58066Por;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.save.repository.SavedAudioRepository$setIsAudioSaved$4", f = "SavedAudioRepository.kt", i = {}, l = {135, 137}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class SavedAudioRepository$setIsAudioSaved$4 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AbstractC53525Nlr A02;
    public final /* synthetic */ InterfaceC58066Por A03;
    public final /* synthetic */ C52678NSa A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedAudioRepository$setIsAudioSaved$4(AbstractC53525Nlr abstractC53525Nlr, InterfaceC58066Por interfaceC58066Por, C52678NSa c52678NSa, String str, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(1, interfaceC23621Ds);
        this.A01 = j;
        this.A04 = c52678NSa;
        this.A02 = abstractC53525Nlr;
        this.A03 = interfaceC58066Por;
        this.A05 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        long j = this.A01;
        return new SavedAudioRepository$setIsAudioSaved$4(this.A02, this.A03, this.A04, this.A05, interfaceC23621Ds, j);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((SavedAudioRepository$setIsAudioSaved$4) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.save.repository.SavedAudioRepository$setIsAudioSaved$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
