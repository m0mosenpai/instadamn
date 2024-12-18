package X;

import android.os.SystemClock;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Wx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96874Wx {
    public final C46282Ap A00;
    public final C4SS A03;
    public final HeroPlayerSetting A04;
    public final Map A05 = new HashMap();
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.4Wz] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.4Wz] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.4Wz] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.4Wz] */
    public static void A00(final C96874Wx c96874Wx) {
        Map map = c96874Wx.A05;
        EnumC96884Wy enumC96884Wy = EnumC96884Wy.A05;
        C2A4 c2a4 = c96874Wx.A00.A03;
        c2a4.A01();
        ?? r1 = new Object() { // from class: X.4Wz
            public Map A00 = new HashMap();
        };
        c2a4.A01();
        map.put(enumC96884Wy, Arrays.asList(r1, new Object() { // from class: X.4Wz
            public Map A00 = new HashMap();
        }));
        map.put(EnumC96884Wy.A04, Arrays.asList(new Object() { // from class: X.4Wz
            public Map A00 = new HashMap();
        }, new Object() { // from class: X.4Wz
            public Map A00 = new HashMap();
        }));
        map.put(EnumC96884Wy.A06, Collections.singletonList(new Object() { // from class: X.4Wz
            public Map A00 = new HashMap();
        }));
        map.put(EnumC96884Wy.A03, Collections.singletonList(new Object() { // from class: X.4Wz
            public Map A00 = new HashMap();
        }));
    }

    public C96874Wx(C4SS c4ss, C46282Ap c46282Ap, HeroPlayerSetting heroPlayerSetting) {
        SystemClock.elapsedRealtime();
        this.A04 = heroPlayerSetting;
        this.A00 = c46282Ap;
        this.A03 = c4ss;
        A00(this);
    }
}
