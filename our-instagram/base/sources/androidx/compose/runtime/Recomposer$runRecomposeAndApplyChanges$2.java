package androidx.compose.runtime;

import X.AbstractC23611Dp;
import X.C05A;
import X.C0eB;
import X.C18570vk;
import X.C57Q;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {574, 585}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
/* loaded from: classes3.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public /* synthetic */ Object A09;
    public final /* synthetic */ Recomposer A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A0A = recomposer;
    }

    public static final void A00(C18570vk c18570vk, C18570vk c18570vk2, C18570vk c18570vk3, C18570vk c18570vk4, Recomposer recomposer, List list, List list2, List list3) {
        C05A c05a = Recomposer.A0N;
        synchronized (recomposer.A0D) {
            list.clear();
            list2.clear();
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                C57Q c57q = (C57Q) list3.get(i);
                c57q.A72();
                Recomposer.A02(c57q, recomposer);
            }
            list3.clear();
            Object[] objArr = c18570vk.A03;
            long[] jArr = c18570vk.A02;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((j & ((j ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - (((i2 - length) ^ (-1)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j & 255) < 128) {
                                C57Q c57q2 = (C57Q) objArr[(i2 << 3) + i4];
                                c57q2.A72();
                                Recomposer.A02(c57q2, recomposer);
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            c18570vk.A05();
            Object[] objArr2 = c18570vk2.A03;
            long[] jArr2 = c18570vk2.A02;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr2[i5];
                    if ((((j2 ^ (-1)) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - (((i5 - length2) ^ (-1)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j2 & 255) < 128) {
                                ((C57Q) objArr2[(i5 << 3) + i7]).AH7();
                            }
                            j2 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length2) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            c18570vk2.A05();
            c18570vk3.A05();
            Object[] objArr3 = c18570vk4.A03;
            long[] jArr3 = c18570vk4.A02;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    if ((((j3 ^ (-1)) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - (((i8 - length3) ^ (-1)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j3 & 255) < 128) {
                                C57Q c57q3 = (C57Q) objArr3[(i8 << 3) + i10];
                                c57q3.A72();
                                Recomposer.A02(c57q3, recomposer);
                            }
                            j3 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length3) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            c18570vk4.A05();
        }
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.A0A, (InterfaceC23621Ds) obj3);
        recomposer$runRecomposeAndApplyChanges$2.A09 = obj2;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x014d -> B:20:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0183 -> B:6:0x0035). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
