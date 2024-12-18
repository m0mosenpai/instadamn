package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: X.2Mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C48832Mb extends C03E implements InterfaceC16570sA {
    public static final C48832Mb A00 = new C48832Mb();

    public C48832Mb() {
        super(6, AbstractC48852Md.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        C2L2 c2l2 = (C2L2) obj2;
        C2LC c2lc = (C2LC) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        C2ME c2me = (C2ME) obj5;
        C2MX c2mx = (C2MX) obj6;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c2l2, 1);
        C14360o3.A0B(c2lc, 2);
        C14360o3.A0B(workDatabase, 3);
        C14360o3.A0B(c2me, 4);
        C14360o3.A0B(c2mx, 5);
        C48872Mf c48872Mf = new C48872Mf(context, c2l2, workDatabase);
        AbstractC48952Mo.A00(context, SystemJobService.class, true);
        C48442Kl.A00();
        return AbstractC16960so.A1Q(c48872Mf, new C49042Mx(context, c2l2, c2mx, new C49012Mu(c2mx, c2lc), c2me, c2lc));
    }
}
