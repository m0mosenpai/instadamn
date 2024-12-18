package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.R;
import com.instagram.archive.fragment.ArchiveReelCalendarFragment;
import com.instagram.model.reels.Reel;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: X.NFr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52375NFr extends AbstractC51171MjF {
    public static final Typeface A0D = Typeface.create("sans-serif-medium", 0);
    public static final Typeface A0E = Typeface.create("sans-serif-light", 0);
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final ColorFilter A07;
    public final ArchiveReelCalendarFragment A09;
    public final InterfaceC11380iw A0A;
    public final Drawable A08 = new ShapeDrawable(new OvalShape());
    public final List A0B = AbstractC166987dD.A1E();
    public final Map A0C = AbstractC166987dD.A1G();

    static {
        Color.argb(255, 232, 255, 186);
    }

    public final int A02(Reel reel) {
        Date date = (Date) this.A0C.get(reel.getId());
        if (date == null) {
            return -1;
        }
        return AbstractC37302Gc3.A02(AbstractC37300Gc1.A0Q(A01(date), super.A03));
    }

    public C52375NFr(Context context, ArchiveReelCalendarFragment archiveReelCalendarFragment, InterfaceC11380iw interfaceC11380iw) {
        this.A06 = context;
        Resources resources = context.getResources();
        this.A09 = archiveReelCalendarFragment;
        this.A0A = interfaceC11380iw;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        int floor = (int) Math.floor((AbstractC13880nE.A0A(context) - (resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * 2)) / AbstractC51171MjF.A05);
        this.A01 = floor;
        this.A04 = floor - (dimensionPixelSize * 2);
        this.A02 = context.getColor(R.color.grey_5);
        this.A03 = context.getColor(R.color.grey_2);
        this.A05 = context.getColor(R.color.grey_1);
        this.A07 = C3DY.A00(Color.argb(30, 0, 0, 0));
        setHasStableIds(true);
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        long j = i;
        C0f9.A0A(-1310275661, C0f9.A03(-744654409));
        return j;
    }
}
