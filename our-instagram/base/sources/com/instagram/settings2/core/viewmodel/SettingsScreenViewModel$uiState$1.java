package com.instagram.settings2.core.viewmodel;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C0s9;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.viewmodel.SettingsScreenViewModel$uiState$1", f = "SettingsScreenViewModel.kt", i = {0, 0, 1, 1, 2, 2}, l = {162, 161, 175, 181, 180}, m = "invokeSuspend", n = {"$this$combineTransform", "disableNavigationRowClick", "$this$combineTransform", "disableNavigationRowClick", "$this$combineTransform", "disableNavigationRowClick"}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0"})
/* loaded from: classes9.dex */
public final class SettingsScreenViewModel$uiState$1 extends AbstractC23611Dp implements C0s9 {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ boolean A04;
    public final /* synthetic */ SettingsScreenViewModel A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsScreenViewModel$uiState$1(SettingsScreenViewModel settingsScreenViewModel, InterfaceC23621Ds interfaceC23621Ds) {
        super(7, interfaceC23621Ds);
        this.A05 = settingsScreenViewModel;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|2|(1:(1:(1:(1:(3:8|9|10)(5:12|13|(1:15)|9|10))(5:16|17|(4:19|(1:21)|13|(0))|9|10))(5:22|23|24|9|10))(2:26|27))(5:39|40|41|42|(2:44|45)(4:46|47|48|(1:50)(1:51)))|28|29|(4:31|24|9|10)(1:32)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.SettingsScreenViewModel$uiState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.C0s9
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean A1a = AbstractC166987dD.A1a(obj3);
        SettingsScreenViewModel$uiState$1 settingsScreenViewModel$uiState$1 = new SettingsScreenViewModel$uiState$1(this.A05, (InterfaceC23621Ds) obj7);
        settingsScreenViewModel$uiState$1.A01 = obj;
        settingsScreenViewModel$uiState$1.A02 = obj2;
        settingsScreenViewModel$uiState$1.A04 = A1a;
        settingsScreenViewModel$uiState$1.A03 = obj4;
        return settingsScreenViewModel$uiState$1.invokeSuspend(C0eB.A00);
    }
}
