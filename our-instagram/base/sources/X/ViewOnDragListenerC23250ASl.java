package X;

import android.app.Activity;
import android.content.ClipData;
import android.graphics.drawable.GradientDrawable;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.View;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.ASl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnDragListenerC23250ASl implements View.OnDragListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C7GE A02;
    public final /* synthetic */ C160007Fm A03;

    public ViewOnDragListenerC23250ASl(Activity activity, UserSession userSession, C7GE c7ge, C160007Fm c160007Fm) {
        this.A01 = userSession;
        this.A03 = c160007Fm;
        this.A00 = activity;
        this.A02 = c7ge;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        if (view != null && dragEvent != null) {
            switch (dragEvent.getAction()) {
                case 1:
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(null, this.A01), "ig_drag_start_direct");
                    if (A0f.isSampled()) {
                        A0f.Cht();
                        return true;
                    }
                    return true;
                case 2:
                    return true;
                case 3:
                    final ClipData clipData = dragEvent.getClipData();
                    final Activity activity = this.A00;
                    DragAndDropPermissions requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent);
                    if (clipData != null && requestDragAndDropPermissions != null) {
                        InterfaceC14020nS A00 = C14120nc.A00();
                        final C7GE c7ge = this.A02;
                        A00.ATO(new AbstractRunnableC14200nk() { // from class: X.9jB
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1403800032, 3, false, false);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                android.net.Uri uri;
                                String type;
                                int i;
                                Activity activity2 = activity;
                                ClipData clipData2 = clipData;
                                C7GE c7ge2 = c7ge;
                                ArrayList A1E = AbstractC166987dD.A1E();
                                int itemCount = clipData2.getItemCount();
                                boolean z = false;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < itemCount) {
                                        ClipData.Item itemAt = clipData2.getItemAt(i2);
                                        if (itemAt == null || (uri = itemAt.getUri()) == null || (type = activity2.getContentResolver().getType(uri)) == null) {
                                            break;
                                        }
                                        if (AbstractC16960so.A1Q(Arrays.copyOf(C7GF.A00, 3)).contains(type)) {
                                            i = 1;
                                        } else if (!AbstractC16960so.A1Q(Arrays.copyOf(C7GF.A01, 1)).contains(type)) {
                                            break;
                                        } else {
                                            i = 3;
                                        }
                                        Medium A002 = C8IU.A00(activity2, uri, i);
                                        if (A002 == null) {
                                            break;
                                        }
                                        if (A002.A03 > 90000) {
                                            z = true;
                                            break;
                                        } else {
                                            A1E.add(A002);
                                            i2++;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                C11T.A02(new RunnableC24848Az9(clipData2, c7ge2, A1E, z));
                            }
                        });
                        requestDragAndDropPermissions.release();
                        return true;
                    }
                    C7GF.A00(this.A02);
                    return false;
                case 4:
                case 6:
                    C160007Fm c160007Fm = this.A03;
                    GradientDrawable gradientDrawable = (GradientDrawable) c160007Fm.A0I.getBackground();
                    if (gradientDrawable != null && c160007Fm.A08 != null) {
                        gradientDrawable.mutate();
                        C161487Lj c161487Lj = c160007Fm.A08;
                        gradientDrawable.setStroke(c161487Lj.A03, c161487Lj.A02, c161487Lj.A01, c161487Lj.A00);
                        return true;
                    }
                    return true;
                case 5:
                    C160007Fm c160007Fm2 = this.A03;
                    Activity activity2 = this.A00;
                    int color = activity2.getColor(AbstractC53242c7.A0C(activity2));
                    View view2 = c160007Fm2.A0I;
                    GradientDrawable gradientDrawable2 = (GradientDrawable) view2.getBackground();
                    if (gradientDrawable2 != null) {
                        gradientDrawable2.mutate();
                        gradientDrawable2.setStroke(AbstractC166997dE.A0B(view2.getContext().getResources()), color);
                        return true;
                    }
                    return true;
            }
        }
        return false;
    }
}
