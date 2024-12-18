package X;

/* renamed from: X.0TP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TP implements Comparable {
    public static final C0TP A04;
    public static final C0TP A05;
    public static final C0TP A06;
    public static final C0TP A07;
    public static final C0TP A08;
    public static final C0TP A09;
    public static final C0TP A0A;
    public static final C0TP A0B;
    public static final C0TP A0C;
    public static final C0TP A0D;
    public static final C0TP A0E;
    public static final C0TP A0F;
    public static final C0TP A0G;
    public static final C0TP A0H;
    public static final C0TP A0I;
    public static final C0TP A0J;
    public static final C0TP A0K;
    public static final C0TP A0L;
    public static final C0TP A0M;
    public static final C0TP A0N;
    public static final C0TP A0O;
    public static final C0TP A0P;
    public static final C0TP A0Q;
    public static final C0TP A0R;
    public static final C0TP A0S;
    public static final C0TP A0T;
    public static final C0TP A0U;
    public static final C0TP A0V;
    public static final C0TP A0W;
    public static final C0TP A0X;
    public static final C0TP A0Y;
    public static final C0TP A0Z;
    public static final C0TP A0a;
    public static final C0TP A0b;
    public static final C0TP A0c;
    public static final C0TP A0d;
    public static final C0TP A0e;
    public static final C0TP A0f;
    public static final C0TP A0g;
    public static final C0TP A0h;
    public static final C0TP A0i;
    public static final C0TP A0j;
    public static final C0TP A0k;
    public static final C0TP A0l;
    public static final C0TP A0m;
    public static final C0TP A0n;
    public static final C0TP A0o;
    public static final C0TP A0p;
    public static final C0TP A0q;
    public static final C0TP A0r;
    public static final C0TP A0s;
    public static final C0TP A0t;
    public static final C0TP A0u;
    public static final C0TP A0v;
    public static final C0TP A0w;
    public static final C0TP A0x;
    public static final C0TP A0y;
    public static final C0TP A0z;
    public static final C0TP A10;
    public static final C0TP A11;
    public static final C0TP A12;
    public static final C0TP A13;
    public static final C0TP A14;
    public static final C0TP A15;
    public static final C0TP A16;
    public static final C0TP A17;
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0TP c0tp = (C0TP) obj;
            if (!this.A03.equals(c0tp.A03) || !this.A02.equals(c0tp.A02) || this.A00 != c0tp.A00 || this.A01 != c0tp.A01) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, X.0TP] */
    static {
        Integer num = C05F.A00;
        A0V = new C0TP("java_heap_used", num);
        A0U = new C0TP("java_heap_limit", num);
        A0o = new C0TP("native_heap_used", num);
        A0m = new C0TP("native_heap_arena", num);
        A0n = new C0TP("native_heap_mmaped", num);
        A11 = new C0TP("system_nonevictable", num);
        A0y = new C0TP("system_kernel", num);
        A12 = new C0TP("system_shared", num);
        A0u = new C0TP("system_anonymous", num);
        A0v = new C0TP("system_available", num);
        A0w = new C0TP("system_ion_heap", num);
        A0T = new C0TP("ion_heap_above_app_foregrounded_baseline", num);
        A0x = new C0TP("system_ion_pagepool", num);
        A0B = new C0TP("bitmap", num);
        Integer num2 = C05F.A01;
        A0A = new C0TP("bitmap", num2);
        A17 = new C0TP("window", num2);
        Integer num3 = C05F.A0N;
        A0z = new C0TP("system_memory_red_time", num3);
        A06 = new C0TP("address_space_memory_red_time", num3);
        A0W = new C0TP("java_memory_red_time", num3);
        A10 = new C0TP("system_memory_yellow_time", num3);
        A07 = new C0TP("address_space_memory_yellow_time", num3);
        A0X = new C0TP("java_memory_yellow_time", num3);
        A14 = new C0TP("total_foreground_time", num3);
        ?? obj = new Object();
        obj.A03 = "";
        obj.A02 = "address_space_largest_free_chunk";
        obj.A01 = num;
        obj.A00 = num2;
        A05 = obj;
        A08 = new C0TP("address_space_used", num);
        A13 = new C0TP("thread_count", num2);
        A0H = new C0TP("fresco_in_use_bitmaps", num);
        A0S = new C0TP("in_memory_bitmap_cache", num);
        A16 = new C0TP("video_memory_cache_used", num);
        A15 = new C0TP("video_buffer_total", num);
        A04 = new C0TP("active_media_codecs", num2);
        A0G = new C0TP("own_resident_anonymous", num);
        A0q = new C0TP("resident_anonymous", num);
        A0r = new C0TP("rss", num);
        A09 = new C0TP("all_process_resident_anonymous", num);
        A0P = new C0TP("hermes_allocated", num);
        A0Q = new C0TP("hermes_heap_size", num);
        A0R = new C0TP("hermes_malloc_size", num);
        A0g = new C0TP("maps_ion_heap", num);
        A0h = new C0TP("maps_malloc", num);
        A0i = new C0TP("maps_opengl", num);
        A0f = new C0TP("maps_gralloc", num);
        A0k = new C0TP("maps_so_files", num);
        A0c = new C0TP("maps_art_files", num);
        A0b = new C0TP("maps_apk_jar_zip_files", num);
        A0l = new C0TP("maps_stacks", num);
        A0e = new C0TP("maps_dalvik", num);
        A0d = new C0TP("maps_ashmem", num);
        A0a = new C0TP("maps_anonymous", num);
        A0j = new C0TP("maps_other", num);
        A0I = new C0TP("gc", num2);
        A0O = new C0TP("gpu_total_used", num);
        A0N = new C0TP("gpu_purgeable", num);
        A0J = new C0TP("gpu_cache_image_texture", num);
        A0K = new C0TP("gpu_cache_mask_texture", num);
        A0M = new C0TP("gpu_cache_scratch", num);
        A0L = new C0TP("gpu_cache_other", num);
        A0E = new C0TP("cpu_memory_used", num);
        A0F = new C0TP("cpu_purgeable", num);
        A0C = new C0TP("cpu_cache_glyph", num);
        A0D = new C0TP("cpu_cache_other", num);
        A0Y = new C0TP("layers_memory_used", num);
        A0Z = new C0TP("layers", num2);
        A0s = new C0TP("render_bridge_cache_used", num);
        A0t = new C0TP("render_bridge_image_count", num2);
        A0p = new C0TP("null_metric", num2);
    }

    public C0TP(String str, Integer num) {
        Integer num2 = C05F.A00;
        this.A03 = "";
        this.A02 = str;
        this.A01 = num;
        this.A00 = num2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.0TP] */
    public final C0TP A00(String str) {
        String str2;
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            str2 = str.substring(indexOf + 1);
        } else {
            str2 = "mainprocess";
        }
        String str3 = this.A02;
        Integer num = this.A01;
        Integer num2 = this.A00;
        ?? obj = new Object();
        obj.A03 = "";
        obj.A02 = str3;
        obj.A01 = num;
        obj.A00 = num2;
        obj.A03 = str2;
        return obj;
    }

    public final String A01() {
        String str = this.A03;
        if (!"".equals(str)) {
            return AnonymousClass001.A0g(this.A02, "-", str);
        }
        return this.A02;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C0TP c0tp = (C0TP) obj;
        int compareTo = this.A02.compareTo(c0tp.A02);
        if (compareTo == 0) {
            int compareTo2 = this.A03.compareTo(c0tp.A03);
            if (compareTo2 == 0) {
                int compareTo3 = this.A01.compareTo(c0tp.A01);
                if (compareTo3 == 0) {
                    return this.A00.compareTo(c0tp.A00);
                }
                return compareTo3;
            }
            return compareTo2;
        }
        return compareTo;
    }

    public final int hashCode() {
        String str;
        String str2;
        int hashCode = (this.A03.hashCode() * 7) + (this.A02.hashCode() * 5);
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "HIGHER_IS_WORSE";
        } else {
            str = "HIGHER_IS_BETTER";
        }
        int hashCode2 = hashCode + ((str.hashCode() + intValue) * 3);
        int intValue2 = this.A01.intValue();
        switch (intValue2) {
            case 1:
                str2 = "COUNT";
                break;
            case 2:
                str2 = "SCORE";
                break;
            case 3:
                str2 = "MILLISECONDS";
                break;
            case 4:
                str2 = "BYTES";
                break;
            case 5:
                str2 = "PERCENT";
                break;
            default:
                str2 = "KILOBYTES";
                break;
        }
        return hashCode2 + str2.hashCode() + intValue2;
    }

    public final String toString() {
        return AnonymousClass001.A0g("MemoryTimelineMetric[", A01(), "]");
    }
}
