package com.instagram.debug.devoptions.avatars;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC53426NkF;
import X.C006802i;
import X.C00O;
import X.C05F;
import X.C0eB;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.C51501Mom;
import X.C55555Olp;
import X.InterfaceC16620sF;
import X.InterfaceC19390xP;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1", f = "ImmersiveAvatarViewerDebugFragment.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int label;
    public final /* synthetic */ ImmersiveAvatarViewerDebugFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1(ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.this$0 = immersiveAvatarViewerDebugFragment;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1(this.this$0, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return new ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1(this.this$0, interfaceC23621Ds).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC09560e7.A00(obj);
            } else {
                throw AbstractC166987dD.A13();
            }
        } else {
            AbstractC09560e7.A00(obj);
            final ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment = this.this$0;
            C55555Olp c55555Olp = immersiveAvatarViewerDebugFragment.richAvatarViewHandler;
            if (c55555Olp == null) {
                C14360o3.A0F("richAvatarViewHandler");
                throw C00O.createAndThrow();
            }
            InterfaceC19390xP interfaceC19390xP = c55555Olp.A05;
            InterfaceC19960yQ interfaceC19960yQ = new InterfaceC19960yQ() { // from class: com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1.1

                /* renamed from: com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1$1$WhenMappings */
                /* loaded from: classes10.dex */
                public abstract /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[C05F.A00(17).length];
                        try {
                            iArr[4] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[7] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // X.InterfaceC19960yQ
                public final Object emit(AbstractC53426NkF abstractC53426NkF, InterfaceC23621Ds interfaceC23621Ds) {
                    C006802i qplLogger;
                    C006802i qplLogger2;
                    if (abstractC53426NkF instanceof C51501Mom) {
                        int intValue = ((C51501Mom) abstractC53426NkF).A00.intValue();
                        if (intValue == 4) {
                            qplLogger = ImmersiveAvatarViewerDebugFragment.this.getQplLogger();
                            qplLogger.markerEnd(116928509, (short) 2);
                        } else if (intValue == 7) {
                            qplLogger2 = ImmersiveAvatarViewerDebugFragment.this.getQplLogger();
                            qplLogger2.markerEnd(116928509, (short) 3);
                        }
                    }
                    return C0eB.A00;
                }
            };
            this.label = 1;
            if (interfaceC19390xP.collect(interfaceC19960yQ, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
